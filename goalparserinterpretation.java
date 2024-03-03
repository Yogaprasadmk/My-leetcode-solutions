class Solution {
    public String interpret(String command) {
        String str = "";
        for(int i = 0;i<command.length();i++){
            if(command.charAt(i) == 'G'){str+="G";}
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str+="o";
            }
            else if (command.charAt(i) == '(') {
            str+="al";
            }
        }
        return str;
    }
}
