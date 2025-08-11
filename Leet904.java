class Leet904 {
    public int totalFruit(int[] fruits) {
        int cnt=0;
        int type2=-1;
        int n= fruits.length;
        for(int i=0;i<n;i++){
            int type1=fruits[i];
            for(int j=i+1;j<n;j++){
                    if(type1!=fruits[j]){
                        type2=fruits[j];
                        break;
                    }
                }
                cnt = Math.max(helper(fruits,type1,type2,i),cnt);
            }
           return cnt;
    }


    public int helper(int[] fruits, int type1 ,int type2,int i){
        int cnt = 0;
        int n= fruits.length;
        for(int k=i;k<n;k++){
            if(fruits[k]==type1 || fruits[k]==type2){
                cnt++;
            }else{
                return cnt; 
            }
        }
        return cnt;
        
    }
        
}