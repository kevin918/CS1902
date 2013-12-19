package hw1.q10;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class MapAnalyzerTest
{
	@Test
	public void testGetMap1ContainedObject()
	{
		System.out.println(">> testGetMap1ContainedObject");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(8, 7);
		terrainMap[4][3] = 'T';
		/*
		 *       T
		 *   01234567
		 *   1 -----
		 *   2 -===-
		 *  T3 -=T=-
		 *   4 -===-
		 *   5 -----
		 *   6
		 */
		//--- Sadly, using this syntax will fill it in COLxROW, not ROWxCOL
		//--- To make it match the code, need to rotate it
		int expInfluenceMap[][] = {
		//   0 1 2 3 4 5 6 7
			{0,0,0,0,0,0,0,0},	// 0
			{0,0,2,2,2,2,2,0},	// 1
			{0,0,2,4,4,4,2,0},	// 2
			{0,0,2,4,8,4,2,0},	// 3
			{0,0,2,4,4,4,2,0},	// 4
			{0,0,2,2,2,2,2,0},	// 5
			{0,0,0,0,0,0,0,0} 	// 6
		};
		expInfluenceMap = rotateArray(expInfluenceMap);

		int actualInfluenceMap[][] = instance.getDesirabilityMap(terrainMap);

		assertEquals("size=8x7, width",
				getWidth(expInfluenceMap),  getWidth(actualInfluenceMap));
		assertEquals("size=8x7, height",
				getHeight(expInfluenceMap), getHeight(actualInfluenceMap));
		assertTrue("contents match",
				arraysAreEqual(expInfluenceMap, actualInfluenceMap));

		System.out.println("<< testGetMap1ContainedObject");
	}

	@Test
	public void testGetMap1ClippedObject()
	{
		System.out.println(">> testGetMap1ClippedObject");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(3, 2);
		terrainMap[1][0] = 'T';
		/*
		 *   /012
		 *   0=T=
		 *   1===
		 */
		//--- Sadly, using this syntax will fill it in COLxROW, not ROWxCOL
		//--- To make it match the code, need to rotate it
		int expInfluenceMap[][] = {
		//   0 1 2
			{4,8,4}, // 0
			{4,4,4}	 // 1
		};
		expInfluenceMap = rotateArray(expInfluenceMap);

		int actualInfluenceMap[][] = instance.getDesirabilityMap(terrainMap);

		assertEquals("size=3x2, width",
				getWidth(expInfluenceMap),  getWidth(actualInfluenceMap));
		assertEquals("size=3x2, height",
				getHeight(expInfluenceMap), getHeight(actualInfluenceMap));
		assertTrue("contents match",
				arraysAreEqual(expInfluenceMap, actualInfluenceMap));

		System.out.println("<< testGetMap1ClippedObject");
	}

	@Test
	public void testGetMap3ClippedObjects()
	{
		System.out.println(">> testGetMap3ClippedObjects");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(9, 6);
		terrainMap[1][1] = 'T';
		terrainMap[6][4] = 'C';
		terrainMap[8][2] = 'W';
		/*
		 *   /012345678
		 *   0===-.....
		 *   1=T==---33
		 *   2=======5W
		 *   3---==8895
		 *   4...-=8C8=
		 *   5...-=888=
		 */
		//--- Sadly, using this syntax will fill it in COLxROW, not ROWxCOL
		//--- To make it match the code, need to rotate it
		int expInfluenceMap[][] = {
		//   0 1 2 3 4 5  6 7 8
			{4,4,4,2,0,0, 0,0,0}, // 0
			{4,8,4,4,2,2, 2,3,3}, // 1
			{4,4,4,4,4,4, 4,5,6}, // 2
			{2,2,2,4,4,8, 8,9,5}, // 3
			{0,0,0,2,4,8,16,8,4}, // 4
			{0,0,0,2,4,8, 8,8,4}  // 5
		};
		expInfluenceMap = rotateArray(expInfluenceMap);

		int actualInfluenceMap[][] = instance.getDesirabilityMap(terrainMap);

		assertEquals("size=9x6, width",
				getWidth(expInfluenceMap),  getWidth(actualInfluenceMap));
		assertEquals("size=9x6, height",
				getHeight(expInfluenceMap), getHeight(actualInfluenceMap));
		assertTrue("contents match",
				arraysAreEqual(expInfluenceMap, actualInfluenceMap));

		System.out.println("<< testGetMap3ClippedObjects");
	}

	@Test
	public void testBestMatch3ClippedObjects()
	{
		System.out.println(">> testGetMap3ClippedObjects");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(9, 6);
		terrainMap[1][1] = 'T';
		terrainMap[6][4] = 'C';
		terrainMap[8][2] = 'W';
		/*
		 *   /012345678
		 *   0===-.....
		 *   1=T==---33
		 *   2=======5W
		 *   3---==8895
		 *   4...-=8C8=
		 *   5...-=888=
		 */
		int expX = 7;
		int expY = 3;
		GridPoint result = instance.getBestPosition(terrainMap);
		assertEquals("(7,3)", expX, result.x);
		assertEquals("(7,3)", expY, result.y);

		System.out.println("<< testGetMap3ClippedObjects");
	}

	@Test
	public void testGetMapRiver()
	{
		System.out.println(">> testGetMapRiver");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(11, 6);
		terrainMap[2][1] = 'W';
		terrainMap[3][2] = 'W';
		terrainMap[3][3] = 'W';
		terrainMap[3][4] = 'W';
		terrainMap[4][4] = 'W';
		terrainMap[5][4] = 'W';
		terrainMap[6][4] = 'W';
		terrainMap[7][4] = 'W';
		terrainMap[8][3] = 'W';
		terrainMap[9][2] = 'W';
		/*
		 *    012345678901
		 *   0 ---
		 *   1 -R=-   ---
		 *   2 -*R=  -=R-
		 *   3  *R5***R=-
		 *   4  =RRRRR=-
		 *   5  -=***=-
		 */
		//--- Sadly, using this syntax will fill it in COLxROW, not ROWxCOL
		//--- To make it match the code, need to rotate it
		int expInfluenceMap[][] = {
		//   0 1 2 3 4 5 6 7 8 9 0
			{0,1,1,1,0,0,0,0,0,0,0}, // 0
			{0,1,3,2,1,0,0,0,1,1,1}, // 1
			{0,1,3,4,2,0,0,1,2,3,1}, // 2
			{0,0,3,5,5,3,3,3,4,2,1}, // 3
			{0,0,2,4,5,4,4,4,2,1,0}, // 4
			{0,0,1,2,3,3,3,2,1,0,0}  // 5
		};
		expInfluenceMap = rotateArray(expInfluenceMap);

		int actualInfluenceMap[][] = instance.getDesirabilityMap(terrainMap);

		assertEquals("size=12x6, width",
				getWidth(expInfluenceMap),  getWidth(actualInfluenceMap));
		assertEquals("size=12x6, height",
				getHeight(expInfluenceMap), getHeight(actualInfluenceMap));
		assertTrue("contents match",
				arraysAreEqual(expInfluenceMap, actualInfluenceMap));

		System.out.println("<< testGetMapRiver");
	}

	@Test
	public void testBestPosition3ContainedOverlappingObjects()
	{
		System.out.println(">> testBestPosition3ContainedOverlappingObjects");

		MapAnalyzer instance = new MapAnalyzer();
		/*
		 *       TW* T
		 *    012345678901
		 *   0............
		 *   1..   ----- .
		 *   2..   -===- .
		 *  T3...--==T=- .
		 *  W4...-W====- .
		 *  *5.--==*---- .  <--- overlap of T,T,W
		 *   6.-===-     .
		 *  T7.-=T=-     .
		 *   8.-===-     .
		 *   9.-----     .
		 *   0............
		 */
		char[][] terrainMap = createBlankTerrainMap(12, 11);
		terrainMap[7][3] = 'T';
		terrainMap[4][4] = 'W';
		terrainMap[3][7] = 'T';

		int expX = 5;
		int expY = 5;
		GridPoint result = instance.getBestPosition(terrainMap);
		assertEquals("(5,5)", expX, result.x);
		assertEquals("(5,5)", expY, result.y);

		System.out.println("<< testBestPosition3ContainedOverlappingObjects");
	}

	@Test
	public void testGetMap3ContainedOverlappingObjects()
	{
		System.out.println(">> testGetMap3ContainedOverlappingObjects");

		MapAnalyzer instance = new MapAnalyzer();
		char[][] terrainMap  = createBlankTerrainMap(12, 11);
		terrainMap[7][3] = 'T';
		terrainMap[4][4] = 'W';
		terrainMap[3][7] = 'T';
		/*
		 *       TW* T
		 *    012345678901
		 *   0............
		 *   1..   ----- .
		 *   2..   -===- .
		 *  T3...--==T=- .
		 *  W4...-W====- .
		 *  *5.--==*---- .  <--- overlap of T,T,W
		 *   6.-===-     .
		 *  T7.-=T=-     .
		 *   8.-===-     .
		 *   9.-----     .
		 *   0............
		 */
		//--- Sadly, using this syntax will fill it in COLxROW, not ROWxCOL
		//--- To make it match the code, need to rotate it
		int expInfluenceMap[][] = {
		//   0 1 2 3 4 5 6 7 8 9 0 1
			{0,0,0,0,0,0,0,0,0,0,0,0},	// 0
			{0,0,0,0,0,2,2,2,2,2,0,0},	// 1
			{0,0,0,0,0,2,4,4,4,2,0,0},	// 2
			{0,0,0,1,1,3,4,8,4,2,0,0},	// 3
			{0,0,0,1,2,3,4,4,4,2,0,0},	// 4
			{0,2,2,3,3,5,2,2,2,2,0,0},	// 5
			{0,2,4,4,4,2,0,0,0,0,0,0},	// 6
			{0,2,4,8,4,2,0,0,0,0,0,0},	// 7
			{0,2,4,4,4,2,0,0,0,0,0,0},	// 8
			{0,2,2,2,2,2,0,0,0,0,0,0},	// 9
			{0,0,0,0,0,0,0,0,0,0,0,0} 	// 0
		};
		expInfluenceMap = rotateArray(expInfluenceMap);

		int actualInfluenceMap[][] = instance.getDesirabilityMap(terrainMap);

		assertEquals("size=12x11, width",
				getWidth(expInfluenceMap),  getWidth(actualInfluenceMap));
		assertEquals("size=12x11, height",
				getHeight(expInfluenceMap), getHeight(actualInfluenceMap));
		assertTrue("contents match",
				arraysAreEqual(expInfluenceMap, actualInfluenceMap));

		System.out.println("<< testGetMap3ContainedOverlappingObjects");
	}


	/************************************************************************
	 * Utility functions
	 ************************************************************************/
	// <editor-fold defaultstate="collapsed" desc="utility functions">
	/**
	 * Trying to remember why i wrote this when jUnit already has an
	 * assertArrayEquals method. Maybe it was because i wanted better
	 * failure messages.
	 * @param a A two-dimensional array
	 * @param b A different two-dimensional array
	 * @return Whether the two arrays have the same contents in every cell
	 */
	private boolean arraysAreEqual(int a[][], int b[][])
	{
		int width  = getWidth(a);
		int height = getHeight(a);
		if ((width != getWidth(b)) || (height != getHeight(b)))
		{
			return false;
		}

		for (int y=0; y<height; y++)
		{
			for (int x=0; x<width; x++)
			{
				if (a[x][y] != b[x][y])
				{
					System.out.println("  content match failure at (" +
							x + "," + y + "): Expected " +
							a[x][y] + ", got " + b[x][y]);
					System.out.println(" Expected:");
					printMap(a);
					System.out.println(" Actual:");
					printMap(b);
					return false;
				}
			}
		}

		return true;
	}

	private char[][] createBlankTerrainMap(int width, int height)
	{
		char terrainMap[][] = new char[width][height];

		for (int y=0; y<height; y++)
		{
			for (int x=0; x<width; x++)
			{
				terrainMap[x][y] = ' ';
			}
		}

		return terrainMap;
	}

	public int getBestPositionScore(char[][] terrainMap)
	{
		MapAnalyzer instance   = new MapAnalyzer();
		int influenceMap[][]   = instance.getDesirabilityMap(terrainMap);
		GridPoint bestPosition = instance.getBestPosition(terrainMap);
		return influenceMap[bestPosition.x][bestPosition.y];
	}

	private int getWidth(char[][] map)
	{
		return map.length;
	}
	private int getHeight(char[][] map)
	{
		return map[0].length;
	}
	private int getWidth(int[][] map)
	{
		return map.length;
	}
	private int getHeight(int[][] map)
	{
		return map[0].length;
	}

	private void printMap(int map[][])
	{
		int width  = getWidth(map);
		int height = getHeight(map);

		//--- Coordinates across top
		System.out.print("   ");
		for (int x=0; x<width; x++)
		{
			System.out.print(x%10);
		}
		System.out.println();
		System.out.print("   ");
		for (int x=0; x<width; x++)
		{
			System.out.print("-");
		}
		System.out.println("|");

		for (int y=0; y<height; y++)
		{
			System.out.print("   ");
			for (int x=0; x<width; x++)
			{
					System.out.print(map[x][y]);
			}
			System.out.println("|" + y);
		}
	}

	/**
	 * Turn 2D array on its side. Used to align what an array looks like
	 * when entering it using the [][] = { {}, {} } syntax with how we
	 * actually want to represent it. Call this when you want to manually
	 * enter values in a way that spatially makes sense but need to compare
	 * it to values set by a computer.
	 * @param original An array to be turned on its side.
	 * @return Array rotated to its side.
	 */
	private int[][] rotateArray(int original[][])
	{
		int width  = getHeight(original);
		int height = getWidth( original);
		int rotation[][] = new int[width][height];

		for (int y=0; y<height; y++)
		{
			for (int x=0; x<width; x++)
			{
				rotation[x][y] = original[y][x];
			}
		}

		return rotation;
	}
	// </editor-fold>
}
