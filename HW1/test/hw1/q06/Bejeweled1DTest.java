package hw1.q06;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author baylor
 */
public class Bejeweled1DTest
{
	@Test
	public void testNoMap()
	{
		// Map: null
		Bejeweled1D game = new Bejeweled1D();
		int expected = 0;
		int actual = game.play(null);
		assertEquals("play null map", expected, actual);
		actual = game.playOnce(null);
		assertEquals("playOnce null map", expected, actual);
		actual = game.playOneMove(null, 0);
		assertEquals("playOneMove null map", expected, actual);
	}

	@Test
	public void testEmptyMap()
	{
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("");
		int expected = 0;
		int actual = game.play(map);
		assertEquals("play empty map", expected, actual);
		actual = game.playOnce(null);
		assertEquals("playOnce empty map", expected, actual);
		actual = game.playOneMove(null, 0);
		assertEquals("playOneMove empty map", expected, actual);
	}

	@Test
	public void testShortMapPlay()
	{
		// Map: AB
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("AB");
		int expected = 0;
		int actual   = game.play(map);
		assertEquals("AB score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("AB # gems", expected, actual);
		String expectedText = "AB";
		String actualText   = map.toString();
		assertEquals("AB chain", expectedText, actualText);
	}

	@Test
	public void testShortMapPlayOnce()
	{
		// Map: AB
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("AB");
		int expected = 0;
		int actual   = game.playOnce(map);
		assertEquals("AB score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("AB # gems", expected, actual);
		String expectedText = "AB";
		String actualText   = map.toString();
		assertEquals("AB chain", expectedText, actualText);
	}

	@Test
	public void testShortMapPlayOneMove()
	{
		// Map: AB
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("AB");
		int expected = 0;
		int actual   = game.playOneMove(map, 0);
		assertEquals("AB score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("AB # gems", expected, actual);
		String expectedText = "AB";
		String actualText   = map.toString();
		assertEquals("AB chain", expectedText, actualText);
	}

	@Test
	public void testNoMove()
	{
		// Map: ABC
		Bejeweled1D game = new Bejeweled1D();

		//--- play()
		BejeweledMap map = new BejeweledMap("ABC");
		int expected = 0;
		int actual   = game.play(map);
		assertEquals("play() ABC score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("play() ABC # gems", expected, actual);
		String expectedText = "ABC";
		String actualText   = map.toString();
		assertEquals("play() ABC chain", expectedText, actualText);

		//--- playOnce()
		map = new BejeweledMap("ABC");
		expected = 0;
		actual   = game.playOnce(map);
		assertEquals("playOnce() ABC score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("playOnce() ABC # gems", expected, actual);
		expectedText = "ABC";
		actualText   = map.toString();
		assertEquals("playOnce() ABC chain", expectedText, actualText);

		//--- playOneMove()
		map = new BejeweledMap("ABC");
		expected = 0;
		actual   = game.playOneMove(map, 0);
		assertEquals("playOneMove() ABC score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("playOneMove() ABC # gems", expected, actual);
		expectedText = "ABC";
		actualText   = map.toString();
		assertEquals("playOneMove() ABC chain", expectedText, actualText);

		// Map: AAB
		//--- play()
		map = new BejeweledMap("AAB");
		expected = 0;
		actual   = game.play(map);
		assertEquals("play() AAB score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("play() AAB # gems", expected, actual);
		expectedText = "AAB";
		actualText   = map.toString();
		assertEquals("play() AAB chain", expectedText, actualText);

		//--- playOnce()
		map = new BejeweledMap("AAB");
		expected = 0;
		actual   = game.playOnce(map);
		assertEquals("playOnce() AAB score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("playOnce() AAB # gems", expected, actual);
		expectedText = "AAB";
		actualText   = map.toString();
		assertEquals("playOnce() AAB chain", expectedText, actualText);

		//--- playOneMove()
		map = new BejeweledMap("AAB");
		expected = 0;
		actual   = game.playOneMove(map, 0);
		assertEquals("playOneMove() AAB score", expected, actual);
		expected = 3;
		actual   = map.size();
		assertEquals("playOneMove() AAB # gems", expected, actual);
		expectedText = "AAB";
		actualText   = map.toString();
		assertEquals("playOneMove() AAB chain", expectedText, actualText);
	}

	@Test
	public void testSingleMoveGoodMove()
	{
		// Map:    BABBC
		// rotate: ABBBC
		Bejeweled1D game = new Bejeweled1D();

		//--- play()
		BejeweledMap map = new BejeweledMap("BABBC");
		int expected = 1;
		int actual   = game.play(map);
		assertEquals("play() BABBC score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("play() BABBC # gems", expected, actual);
		String expectedText = "AC";
		String actualText   = map.toString();
		assertEquals("play() BABBC chain", expectedText, actualText);

		//--- playOnce()
		map = new BejeweledMap("BABBC");
		expected = 1;
		actual   = game.playOnce(map);
		assertEquals("playOnce() BABBC score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("playOnce() BABBC # gems", expected, actual);
		expectedText = "AC";
		actualText   = map.toString();
		assertEquals("playOnce() BABBC chain", expectedText, actualText);

		//--- playOneMove()
		map = new BejeweledMap("BABBC");
		expected = 1;
		actual   = game.playOneMove(map, 0);
		assertEquals("playOneMove() BABBC score", expected, actual);
		expected = 2;
		actual   = map.size();
		assertEquals("playOneMove() BABBC # gems", expected, actual);
		expectedText = "AC";
		actualText   = map.toString();
		assertEquals("playOneMove() BABBC chain", expectedText, actualText);
	}

	@Test
	public void testSingleMoveBadMove()
	{
		// Map:    ABBC
		// rotate: BBAC
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("ABBC");
		int expected = 0;
		int actual   = game.playOneMove(map, 0);
		assertEquals("Score on ABBC", expected, actual);
		expected = 4;
		actual   = map.size();
		assertEquals("# gems", expected, actual);
		assertFalse("gems still on the map", map.isEmpty());
		//--- It won't rotate because there isn't 3 of any color so it knows
		//---	before trying that it can't win
		String expectedText = "ABBC";
		String actualText   = map.toString();
		assertEquals("chain", expectedText, actualText);
	}

	@Test
	public void testCleanSweep()
	{
		// Map: AAABBBCCC
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("AAABBBCCC");
		int expectedScore = 3;
		int actualScore   = game.play(map);
		assertEquals("Score on AAABBBCCC", expectedScore, actualScore);
		assertTrue("all gems removed", map.isEmpty());
		assertTrue("game over", game.isOver());
	}

	@Test
	public void testCleanSweepPlayOnce()
	{
		// Map: AAABBBCCC
		Bejeweled1D game = new Bejeweled1D();
		BejeweledMap map = new BejeweledMap("AAABBBCCC");
		int expectedScore = 3;
		int actualScore   = game.playOnce(map);
		assertEquals("Score on AAABBBCCC", expectedScore, actualScore);
		assertTrue("all gems removed", map.isEmpty());
	}

	@Test
	public void testPlayOnceWin()
	{
		Bejeweled1D game = new Bejeweled1D();

		BejeweledMap map = new BejeweledMap("AABBCBCCA");
		int expectedScore = 3;
		int actualScore   = game.play(map);
		assertEquals("Score on AABBCBCCA", expectedScore, actualScore);
		assertTrue("all gems removed", map.isEmpty());
	}
}