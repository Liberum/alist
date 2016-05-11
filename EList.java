package alist;

public interface EList
{
	void  init(int[] ini);
	int   size();
	void  clear();
	int[] toArray();

	void  addStart(int value);
	void  addEnd(int value);
	void  addPos(int position, int value);
	void  delStart();
	void  delEnd();
	void  delPos(int position);

	int   min();
	int   max();
	int   minIndex();
	int   maxIndex();

	void  reverse();
	void  halfReverse();
	void  sort();
	void  set(int position, int value);
	int   get(int position);
}
