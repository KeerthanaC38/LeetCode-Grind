import java.util.List;
import java.util.ArrayList;
class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(1)));
        for(int i=1;i<=rowIndex;i++){
            ArrayList<Integer> al=new ArrayList<Integer>();
            al.add(1);
            for(int j=1;j<i;j++){
                al.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            al.add(1);
            list.add(al);
        }
        return list.get(rowIndex);
    }
}