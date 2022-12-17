class ContainsDuplicate {
    public boolean containsDuplicates(int[] nums) {
        HashSet set=new HashSet();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
