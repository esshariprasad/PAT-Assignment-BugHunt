import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert((-3240));
        aVLTree0.insert(1779);
        aVLTree0.delete(663);
        aVLTree0.insert(0);
        aVLTree0.insert((-791));
        aVLTree0.delete((-791));
        AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
        aVLTree0.delete((-935));
        AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
        aVLTree_Node0.left = aVLTree_Node1;
        aVLTree0.insert((-450));
        aVLTree_Node0.left.key = (-1467);
        aVLTree_Node0.height = 391;
        aVLTree_Node0.key = (-791);
        aVLTree_Node1.height = (-935);
        aVLTree_Node0.height = (-791);
        aVLTree_Node0.height = 663;
        aVLTree_Node0.key = (-791);
        aVLTree0.insert(391);
        aVLTree0.getBalance(aVLTree_Node0);
        // Undeclared exception!
        
        
    }

    

    @Test
    public void test01()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
        assertEquals((-1), aVLTree0.height());
        assertNotNull(aVLTree0);
        
        aVLTree0.delete(202);
        System.out.println("AVl Tree");
        
        System.out.println(aVLTree0.height());
        assertEquals((-1), aVLTree0.height());
        
        aVLTree0.delete((-1195));
        assertEquals((-1), aVLTree0.height());
        
        aVLTree0.insert(156);
        assertEquals(0, aVLTree0.height());
        
        aVLTree0.delete((-1195));
        assertEquals(0, aVLTree0.height());
        
        aVLTree0.delete(2572);
        assertEquals(0, aVLTree0.height());
        
        aVLTree0.insert(2572);
        assertEquals(1, aVLTree0.height());
        
        int int0 = aVLTree0.height();
        assertEquals(1, int0);
        assertEquals(1, aVLTree0.height());
        
        AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
        assertEquals(1, aVLTree0.height());
        assertNotNull(aVLTree_Node0);
        
        AVLTree.Node aVLTree_Node1 = aVLTree0.find(156);
        assertSame(aVLTree_Node1, aVLTree_Node0);
        assertEquals(1, aVLTree0.height());
        assertNotNull(aVLTree_Node1);
        
        AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
        assertSame(aVLTree_Node2, aVLTree_Node0);
        assertSame(aVLTree_Node2, aVLTree_Node1);
        assertEquals(1, aVLTree0.height());
        assertNotNull(aVLTree_Node2);
        
        aVLTree_Node2.height = 736;
        assertEquals(736, aVLTree0.height());
        
        aVLTree_Node2.key = (-1303);
        assertEquals(736, aVLTree0.height());
        
        aVLTree_Node2.height = (-1303);
        assertEquals((-1303), aVLTree0.height());
        
        AVLTree.Node aVLTree_Node3 = aVLTree_Node2.right;
        assertNotSame(aVLTree_Node3, aVLTree_Node2);
        assertNotSame(aVLTree_Node3, aVLTree_Node0);
        assertNotSame(aVLTree_Node3, aVLTree_Node1);
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node2));
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node1));
        assertNotNull(aVLTree_Node3);
        
        aVLTree_Node3.key = (-1195);
        assertEquals((-1303), aVLTree0.height());
        
        int int1 = aVLTree0.getBalance(aVLTree_Node3);
        assertSame(aVLTree_Node2, aVLTree_Node0);
        assertSame(aVLTree_Node2, aVLTree_Node1);
        assertNotSame(aVLTree_Node2, aVLTree_Node3);
        assertNotSame(aVLTree_Node3, aVLTree_Node2);
        assertNotSame(aVLTree_Node3, aVLTree_Node0);
        assertNotSame(aVLTree_Node3, aVLTree_Node1);
        assertFalse(int1 == int0);
        assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node3));
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node2));
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node0));
        assertFalse(aVLTree_Node3.equals((Object)aVLTree_Node1));
        assertEquals(0, int1);
        assertEquals((-1303), aVLTree0.height());
        
        AVLTree.Node aVLTree_Node4 = aVLTree0.getRoot();
        assertSame(aVLTree_Node4, aVLTree_Node2);
        assertSame(aVLTree_Node4, aVLTree_Node0);
        assertNotSame(aVLTree_Node4, aVLTree_Node3);
        assertSame(aVLTree_Node4, aVLTree_Node1);
        assertFalse(aVLTree_Node4.equals((Object)aVLTree_Node3));
        assertEquals((-1303), aVLTree0.height());
        assertNotNull(aVLTree_Node4);
        
        int int2 = 0;
        aVLTree_Node0.right = aVLTree_Node4;
        assertEquals((-1303), aVLTree0.height());
        
        aVLTree0.insert(int2);
        aVLTree0.getBalance(aVLTree_Node0);
        aVLTree0.getBalance(aVLTree_Node0);
        int int3 = 0;
        aVLTree0.delete(int3);
        int int4 = 1144;
        aVLTree0.insert(int4);
    }

    
  
}