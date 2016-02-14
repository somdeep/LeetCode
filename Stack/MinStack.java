// 155. Min Stack My Submissions Question
// Total Accepted: 61270 Total Submissions: 285352 Difficulty: Easy


                //Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
                //
                //push(x) -- Push element x onto stack.
                //pop() -- Removes the element on top of the stack.
                //top() -- Get the top element.
                //getMin() -- Retrieve the minimum element in the stack.
                //
                //
                //

class MinStack {
	Node  top;
	Node min;    

	class Node
	{
		int val;
		Node next;
		Node premin;

		Node(int v)
		{   
			this.val=v;
		}
	}


                //     void MinStack()
                //     {
                //         top=-1;
                // //        min=1000;
                //     }

	public void push(int x) 
	{
		Node curTop=top;
		top=new Node(x);
		top.next=curTop;

		if(curTop==null)
			min=top;

		if (x<min.val) {
			top.premin=min;
			min=top;
		}

	}
	public void pop() {
		if(top==min)
			min=top.premin;

		if(top!=null)
			top=top.next;

	}
	public int top() {
		return top.val;
	}
	public int getMin() {
		return min.val;
	}


	public static void main(String args[])
	{
		System.out.println("Min-Stack");
		MinStack m = new MinStack();

		m.push(3);m.push(2);m.push(3);
		m.push(1);
		System.out.println(m.top());
		System.out.println(m.top());
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());

	}

}
