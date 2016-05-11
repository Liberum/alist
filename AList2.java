package alist;

public class AList2 implements EList 
{
	int[] ar = new int[30];
	int start = 15;
	int end   = 15;

	@Override
	public void init(int[] ini) 
	{
		if (ini == null)
		{
			ini = new int[0];
		}

		start = ar.length/2 - ini.length/2;
		for (int i = 0; i < ini.length; i++) 
		{
			ar[i+start] = ini[i];
		}		
		end = start + ini.length;	
	}

	@Override
	public int size() 
	{
		return end - start;
	}

	@Override
	public void clear() 
	{
		end = start = ar.length/2;
	}

	@Override
	public int[] toArray() 
	{
		int[] tmp = new int[size()];
		for (int i = 0; i < tmp.length; i++) 
		{
			tmp[i] = ar[i+start];
		}
		return tmp;
	}

	@Override
	public void addStart(int value) 
	{
		ar[--start] = value;
	}

	@Override
	public void addEnd(int value) 
	{
		ar[end++] = value;	
	}

	@Override
	public void addPos(int position, int value) {
		if (position < size() - start || position > size() + start)
		{
			throw new IllegalArgumentException();
		}
		for(int i = end; i > start + position; i--)
		{
			ar[i] = ar[i - 1];
		}
		ar[start + position] = value;
		end++;

	}

	@Override
	public void delStart()
	{
        if (size() == 0)
        {
            return;
        }
		start++;	
	}

	@Override
	public void delEnd() 
	{
        if (size() == 0)
        {
            return;
        }
		end--;
	}

	@Override
	public void delPos(int position) 
	{
        if (position < 0 || position >= size())
        {
            throw new IllegalArgumentException();
        }
		for (int i = start+1; i < end; i++) 
		{
			if(i >= start + position)
			{
			ar[i] = ar[i+1];
			}
		}
		end--;

	}

	@Override
	public int min()
	{
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}

		int min = ar[start];
		for (int i = start+1; i < end; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;	
	}

	@Override
	public int max() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}

		int max = ar[start];
		for (int i = start+1; i < end; i++)
		{
			if (ar[i] > max)
			{
				max = ar[i];
			}
		}
		return max;	
	}

	@Override
	public int minIndex() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}

		int min = ar[start];
		int res = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
				res = i;
			}
		}
		return res - start;	
	}

	@Override
	public int maxIndex() {
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}

		int max = ar[start];
		int res = start;
		for (int i = start+1; i < end; i++)
		{
			if (ar[i] > max)
			{
				max = ar[i];
				res = i;
			}
		}
		return res - start;	
	}

	@Override
	public void reverse() {
		int d = (size()%2 == 0) ? 1 : 0;
		
		for (int i = start; i < ar.length/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length - i - d];
			ar[ar.length - i - d] = temp;
		}

	}

	@Override
	public void halfReverse() {
		
		int d = (size()%2 == 0) ? 0 : 1;
		int t = 0;
		for(int i = start; i < ar.length/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length/2+d+t];
			ar[ar.length/2+d+t] = temp;
			t++;
		}

	}

	@Override
	public void sort() {
		for (int i = start; i < end; i++)
		{
			for (int ii = i+1; ii < end; ii++)
			{
				if(ar[i] > ar[ii])
				{
					int tmp = ar[i];
					ar[i] = ar[ii];
					ar[ii] = tmp;
				}
			}
		}

	}

	@Override
	public void set(int position, int value) {
        if (size() == 0)
        {
            throw new IllegalArgumentException();
        }
			ar[start + position] = value;
	}

	@Override
	public int get(int position) {
        if (position < 0 || position >= size() || size() == 0)
        {
            throw new IllegalArgumentException();
        }
        return ar[start + position];
	}

}
