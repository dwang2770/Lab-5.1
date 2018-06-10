import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch extends AbstractSearch
{
	 Node startNode;
	 Node goalNode;
	
	public DepthFirstSearch (Node startNode, Node goalNode)
	{
		this.startNode = startNode;
		this.goalNode = goalNode;
	}
	
	public boolean search ()
	{
		if (this.startNode.equals(goalNode))
		{
            System.out.println("Route Found!");
            System.out.println(startNode);
        }
		
		Stack <Node> stack = new Stack<>();
	    ArrayList<Node> explored = new ArrayList<>();
	    stack.add(this.startNode);
	    explored.add(startNode);
	
	    while (!stack.isEmpty())
	    {
	    	Node current = stack.pop();
	    	if (current.equals(this.goalNode))
	    	{
	    		System.out.println(explored);
	    		return true;
	    	}
	    	
	    	else
	    	{
	    		explored.add(current);
	    		stack.addAll(current.getChildren());
	    	}
	    	
	    	
	    }
	    return false;
	}
}