class Solution {
    public static List<List<Integer>>result=new ArrayList<>();
    public static List<List<Integer>> generate(int numRows) {
        if (result.size()>=numRows){
           return result.subList(0,numRows);
        }

        if (numRows==1||result.isEmpty()){
            List<Integer>list=new ArrayList<>();
            list.add(1);
            result.add(new ArrayList<>(list));
            if (numRows==1) return result;
        }
        if (numRows==2||result.size()<2){
            List<Integer>list=new ArrayList<>();
            list.add(1);
            list.add(1);
            result.add(new ArrayList<>(list));
            if (numRows==2) return result;
        }

        for (int i = result.size()-1; i <numRows-1; i++) {
            List<Integer>prev=result.get(i);
            List<Integer>ans=new ArrayList<>();ans.add(1);
            for (int j = 0; j <prev.size()-1; j++) {
                int nextEle=prev.get(j)+prev.get(j+1);
                ans.add(nextEle);
            }
            ans.add(1);
            result.add(ans);
        }
        return result;
    }
}