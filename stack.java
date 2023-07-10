
package stack;
class StackUsingArray{
	private int data[];
	private int topIndex;
	
	StackUsingArray(){
		data=new int[10];
		topIndex=-1;
	}
	
	public int size() {
		return topIndex+1;
		
	}
	
	public void push(int data) {
		//If stack is full
		if(topIndex==this.data.length-1) {
			doubleCapacity();
		}
		
		this.data[++topIndex]=data;
		
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}

	public int top() throws ArrayIndexOutOfBoundsException{
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return data[topIndex];
	}
	
	public  int pop() throws ArrayIndexOutOfBoundsException {
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int temp=data[topIndex];
		topIndex--;
		return temp;
	}
	
	public boolean isEmpty() {
//		if(topIndex==-1) {
//			return true;
//		}
//		return false;
		return topIndex==-1;
	}
	
	
}

public class Stck_using_array {
public static void main(String[] args) {
	StackUsingArray st=new StackUsingArray();
	
	
	
	
	
	
	
	
	
}
}

