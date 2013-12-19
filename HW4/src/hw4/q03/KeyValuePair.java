package hw4.q03;

/**
 *
 * @author baylor
 */
class KeyValuePair<K, V>
{
	public K key;
	public V value;

	public KeyValuePair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return key.toString() + "=" + value.toString();
	}
}
