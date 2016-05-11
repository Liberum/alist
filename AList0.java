package alist;

public class AList0 implements EList
{
	private  int[] ar = {};

	@Override
	public  void init(int[] ini)
	{
		if (ini == null)
		{
			ini = new int[0];
		}

		this.ar = new int[ini.length];
		for (int i = 0; i < ini.length; i++) 
		{
			ar[i] = ini[i];
		}
	}

	@Override
	public int size()
	{
		return ar.length;
	}

	@Override
	public  void clear()
	{
		ar = new int[0];
	}

	@Override
	public int[] toArray()
	{
		int[] tmp = new int[ar.length];
		for (int i = 0; i < ar.length; i++) 
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}

	@Override
    public void addStart(int value)
    {
        int[] newArray = new int[ar.length + 1];
        newArray[0] = value;
        for (int i = 1; i < newArray.length; i++)
        {
            newArray[i] = ar[i - 1];
        }
        ar = newArray;
    }

	@Override
    public void addEnd(int value)
    {
        int[] newArray = new int[ar.length + 1];

        newArray[ar.length] = value;

        for (int i = 0; i < newArray.length - 1; i++)
        {
            newArray[i] = ar[i];
        }
        ar = newArray;
    }

	@Override
    public void addPos(int position, int value)
    {
        if (position < 0 || position > size())
        {
            throw new IllegalArgumentException();
        }

        int[] newArray = new int[ar.length + 1];

        for (int i = 0; i < newArray.length; i++)
        {
            if (i == position)
            {
                newArray[i] = value;
            } 
            else if (i < position)
            {
                newArray[i] = ar[i];
            } 
            else
            {
                newArray[i] = ar[i - 1];
            }
        }
        ar = newArray;
    }

	@Override
    public void delStart()
    {
        if (size() == 0)
        {
            return;
        }

        int[] newArray = new int[ar.length - 1];
        
        for (int i = 1; i < ar.length; i++)
        {
            newArray[i - 1] = ar[i];
        }
        ar = newArray;
    }

	@Override
    public void delEnd()
    {
        if (size() == 0)
        {
        	return;
        }

        int[] newArray = new int[ar.length - 1];

        for (int i = 0; i < ar.length - 1; i++)
        {
            newArray[i] = ar[i];
        }
        ar = newArray;
    }

	@Override
    public void delPos(int position)
    {
        if (position < 0 || position >= size())
        {
            throw new IllegalArgumentException();
        }

        int[] newArray = new int[ar.length - 1];

        for (int i = 0; i < ar.length - 1; i++)
        {
            if (i >= position)
            {
                newArray[i] = ar[i + 1];
            } else
            {
                newArray[i] = ar[i];
            }

        }
        ar = newArray;
    }

	@Override
    public int min()
    {
        if (size() == 0)
        {
            throw new IllegalArgumentException();
        }
        int min = ar[0];
        for (int i = 1; i < ar.length; i++)
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
        if (size() == 0)
        {
            throw new IllegalArgumentException();
        }

        int min = ar[0];
        for (int i = 1; i < ar.length; i++)
        {
            if (ar[i] > min)
            {
                min = ar[i];
            }
        }
        return min;
    }

	@Override
    public int minIndex()
    {
        if (size() == 0)
        {
            throw new IllegalArgumentException();
        }

        int minIndex = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] < ar[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

	@Override
    public int maxIndex()
    {
        if (size() == 0)
        {
            throw new IllegalArgumentException();
        }

        int maxIndex = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] > ar[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

	@Override
    public void reverse()
    {
        int right = ar.length - 1;
        int left = 0;
        while (left < right)
        {
            int temp = ar[right];
            ar[right] = ar[left];
            ar[left] = temp;
            right--;
            left++;
        }
    }

	@Override
    public void halfReverse()
    {
        int center = ar.length / 2;
        int secondHalfStart = ar.length - (ar.length / 2);
        int[] temp = new int[center];

        System.arraycopy(ar, 0, temp, 0, center);
        System.arraycopy(ar, secondHalfStart, ar, 0, center);
        System.arraycopy(temp, 0, ar, secondHalfStart, center);
    }

	@Override
    public void sort()
    {
        for (int i = 1; i < ar.length; i++)
        {

            int compare = ar[i];
            int j;
            for (j = i - 1; j >= 0 && ar[j] > compare; j--)
            {
                ar[j + 1] = ar[j];
            }

            ar[j + 1] = compare;
        }

    }

	@Override
    public void set(int position, int value)
    {
        if (position < 0 || position >= size())
        {
            throw new IllegalArgumentException();
        }
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
