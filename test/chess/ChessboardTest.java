/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeff
 */
public class ChessboardTest {
    
    public ChessboardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class Chessboard.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int fromRow = 1;
        int fromCol = 0;
        int toRow = 3;
        int toCol = 0;
        Chessboard instance = new Chessboard();
        instance.move(fromRow, fromCol, toRow, toCol);
        
        assertEquals(instance.board[fromRow][fromCol], '-');
        assertEquals(instance.board[toRow][toCol], 'P');
    }

    /**
     * Test of isValidMove method, of class Chessboard.
     */
    @Test
    public void testIsValidMove() {
        System.out.println("isValidMove");
        int fromRow = 0;
        int fromCol = 0;
        int toRow = 0;
        int toCol = 0;
        Chessboard instance = new Chessboard();
        boolean expResult = false;
        boolean result = instance.isValidMove(fromRow, fromCol, toRow, toCol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Chessboard.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Chessboard instance = new Chessboard();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of reset method, of class Chessboard.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Chessboard instance = new Chessboard();
        instance.move(0,1,0,3);
        instance.reset();
        assertEquals(instance.board[0][1], 'P');
        assertEquals(instance.board[0][3], '-');
        
    }

    /**
     * Test of toString method, of class Chessboard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Chessboard instance = new Chessboard();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Chessboard.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Chessboard.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
