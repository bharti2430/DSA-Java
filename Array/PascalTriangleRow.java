public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row=new ArrayList<>();
		row.add(1);
        long previous=1;
		for(int i=1;i<=rowIndex;i++)
		{
            long current=previous*(rowIndex+1-i)/i;
			row.add((int)current);
            previous=current;
		}
		return row;
    }

Input: rowIndex = 3
Output: [1,3,3,1]

Input: rowIndex = 0
Output: [1]
