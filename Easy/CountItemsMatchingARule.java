class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        int ruleInt = (ruleKey.equals("color")) ? 1 : 0;
        ruleInt = (ruleKey.equals("name")) ? 2 : ruleInt;
        
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).get(ruleInt).equals(ruleValue))
                counter++;
        }
        
        return counter;
    }
}
