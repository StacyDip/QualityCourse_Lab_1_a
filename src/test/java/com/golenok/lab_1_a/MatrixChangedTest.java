/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.golenok.lab_1_a;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stacy
 */
public class MatrixChangedTest {

    public MatrixChangedTest() {
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
     * Test of sumCol method, of class MatrixChanged.
     */
    @Test
    public void testSumColSimple() {

        int[][] mas = {{1, 2, 3}, {2, 2, 4}};
        MatrixChanged instance = new MatrixChanged();
        int[] expResult = {3, 4, 7};
        int[] result = instance.sumCol(mas);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testSerchNumberColWithMinSumSimple() {
        int[][] mas = {{8, 10, 3}, {2, 2, 4}};
        MatrixChanged instance = new MatrixChanged();
        int expResult = 3;
        int result = instance.serchNumberColWithMinSum(mas);
        assertEquals(expResult, result);

    }

    @Test
    public void testSortColNotSorted() {
        int[][] mas = {{8, 5, 3}, {2, 2, 4}, {10, 1, 8}};
        int threshold = 2;
        MatrixChanged instance = new MatrixChanged();
        int[][] expResult = {{10, 5, 3}, {8, 2, 4}, {2, 1, 8}};
        instance.sortCol(mas, threshold);

        assertArrayEquals(expResult, mas);

    }

    @Test
    public void testSortColSorted() {
        int[][] mas = {{8, 5, 1}, {5, 2, 0}, {4, 1, 0}};
        int threshold = 4;
        MatrixChanged instance = new MatrixChanged();
        int[][] expResult = {{8, 5, 1}, {5, 2, 0}, {4, 1, 0}};
        instance.sortCol(mas, threshold);

        assertArrayEquals(expResult, mas);

    }

    @Test
    public void testSortColSortedReverse() {
        int[][] mas = {{4, 1, 1}, {5, 2, 0}, {8, 5, 0}};
        int threshold = 4;
        MatrixChanged instance = new MatrixChanged();
        int[][] expResult = {{8, 5, 1}, {5, 2, 0}, {4, 1, 0}};
        instance.sortCol(mas, threshold);

        assertArrayEquals(expResult, mas);
    }

    @Test(expected = NullPointerException.class)
    public void testValidateMatrixNull() {

        int[][] mas = null;
        MatrixChanged instance = new MatrixChanged();
        instance.validateMatrix(mas);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateNumberColIllegalArgument() {

        int numberCol = 0;
        MatrixChanged instance = new MatrixChanged();
        instance.validateNumberCol(numberCol);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortColValidateMatrixIllegal() {
        int[][] mas = {{}, {}};
        int threshold = 2;
        MatrixChanged instance = new MatrixChanged();

        instance.sortCol(mas, threshold);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortColValidateNumberCol() {
        int[][] mas = {{1, 2}, {2, 1}};
        int threshold = -2;
        MatrixChanged instance = new MatrixChanged();

        instance.sortCol(mas, threshold);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumColValidat() {
        int[][] mas = {{}, {}};

        MatrixChanged instance = new MatrixChanged();

        instance.sumCol(mas);

    }

}
