package alist;

public class AList1 implements EList 
{
	int[] ar = new int[10];
	int top = 0;

	@Override
	public void init(int[] ini) 
	{
		if (ini == null)
		{
			ini = new int[0];
		}

		for (int i = 0; i < ini.length; i++) 
		{
			ar[i] = ini[i];
		}		
		top = ini.length;
	}

	@Override
	public int size() 
	{
		return top;
	}

	@Override
	public void clear() 
	{
		top = 0;	
	}

	@Override
	public int[] toArray()
	{
		int[] tmp = new int[top];
		for (int i = 0; i < top; i++) 
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}
	@Override
	public void addStart(int value) 
	{
		for (int i = top; i > 0; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[0] = value;
		top++;
	}

	@Override
	public void addEnd(int value) 
	{
		ar[top++] = value;
	}

	@Override
	public void addPos(int position, int value)
	{
		if (position < 0 || position > top)
		{
			throw new IllegalArgumentException();
		}
		for(int i = top; i > position; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[position] = value;
		top++;
	}

	@Override
	public void delStart()
	{	
        if (size() == 0)
        {
            return;
        }
		for (int i = 0; i < top; i++) 
		{
			ar[i] = ar[i+1];
		}
		top--;
	}

	@Override
	public void delEnd() 
	{
        if (size() == 0)
        {
            return;
        }
		top--;
	}

	@Override
	public void delPos(int position) 
	{
        if (position < 0 || position >= size())
        {
            throw new IllegalArgumentException();
        }
		for (int i = 0; i < top; i++) 
		{
			if(i >= position)
			{
			ar[i] = ar[i+1];
			}
		}
		top--;
	}

	@Override
	public int min() 
	{
		if (top == 0)
		{
			throw new IllegalArgumentException();
		}
		int min = ar[0];
		for (int i = 1; i < top; i++)
		{
			if (ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;
	}

	@Override
	public int max()
	{
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int max = ar[0];
		for (int i = 1; i < top; i++)
		{
			if (max < ar[i])
			{
				max = ar[i];
			}
		}
		return max;	
	}

	@Override
	public int minIndex() 
	{
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int i = 1; i < top; i++)
		{
			if (ar[ind]>ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}

	@Override
	public int maxIndex() 
	{
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;
		for (int i = 0; i < top; i++)
		{
			if (ar[ind] < ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}

	@Override
	public void reverse() 
	{
		for (int i=0; i<top/2; i++)
		{
			int temp = 0;
			temp = ar[i];
			ar[i] = ar[top-i-1];
			ar[top-i-1] = temp;
		}
	}

	@Override
	public void halfReverse() 
	{
		int d = (top%2 == 0) ? 0 : 1;

		for(int i = 0; i < top/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[top/2+d+i];
			ar[top/2+d+i] = temp;
		}
	}

	@Override
	public void sort() 
	{
		for (int i = 0; i< top - 1;i++)
		{
			int min = i;
			for(int ii = i + 1; ii < top; ii++)
			{
				if (ar[ii]<ar[min]) 
					min = ii;
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}

	@Override
	public void set(int position, int value) 
	{
		if (top == 0)
			throw new IllegalArgumentException();

		if (position < 0 || position >= top)
			throw new ArrayIndexOutOfBoundsException();

		ar[position] = value;
	}

	@Override
	public int get(int position) 
	{
        if (position < 0 || position >= size() || size() == 0)
        {
            throw new IllegalArgumentException();
        }
        return ar[position];
	}
}
