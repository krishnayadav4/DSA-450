// Tree Node
struct Node {
    int data;
    Node* left;
    Node* right;
};

//Function to store the zigzag order traversal of a tree in a list.
    vector <int> zigZagTraversal(Node* root)
    {
     //creating two stacks for level traversals in both order
    	stack<Node*> st1;
    	stack<Node*> st2;
     //vector to store the zigzag traversal
    	vector<int> result;
    	
     //Initialize the first stack with the root element
    	st1.push(root);
    	
     //Iterate until either of the stack is not empty
    	while(!st1.empty() || !st2.empty()){
        //iterate until the first stack is not empty
    	    while(!st1.empty()){
    	        Node* temp=st1.top();
    	        st1.pop();
    	        result.push_back(temp->data);
    	        
    	        if(temp->left)
    	            st2.push(temp->left);
    	        if(temp->right)
    	            st2.push(temp->right);
    	    }
         //Iterate until the second stack is not empty
    	    while(!st2.empty()){
    	        Node* temp=st2.top();
    	        st2.pop();
    	        result.push_back(temp->data);
    	        
    	        if(temp->right)
    	            st1.push(temp->right);
    	        if(temp->left)
    	            st1.push(temp->left);
    	        
    	    }
    	}
    	return result;
    }
