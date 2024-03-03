class Solution {
    public String defangIPaddr(String address) {
        String a = address.replace(".","[.]");
        return a;
    }
}
