class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        
        for(int i = 0 ; i < numRows; i ++) {
            row = new ArrayList<Integer>();
            //Add first element of row
            row.add(1);
            
            if(i == 0) {
                out.add(row);
                continue;
            }
            else {
                List<Integer> prevRow = out.get(i - 1);
                for(int j = 0; j < prevRow.size(); j++) {
                    if(j + 1 < prevRow.size()) {
                        row.add(prevRow.get(j) + prevRow.get(j+1));
                    }
                }
            }
            
            //Add row element of row
            row.add(1);
            out.add(row);
        }
        
        return out;
    }
}
