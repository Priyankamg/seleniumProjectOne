package com.Priyanka.algorithms;

/**
 * Created by prinks on 10/23/17.
 */
public class findPattern {

    public String decrypt(String input, String dec) {
        String enc = input.split("-")[1]; // Atvt hrqgse, Cnikg, Your friend, Alice
        String pattern = "";
        for (int i = 0; i < enc.length(); i++) {
            if (enc.charAt(i) >= 65 && enc.charAt(i) <= 122) {
                int k = enc.charAt(i) - dec.charAt(i);
                if (k < 0) {
                    k = k + 26;
                }
                pattern += k;
            }
        }


        // Cnikg
        // Alice
        // C-2, n-2,i-0,k-9,g-3
        // 22093

        //Atvt hrqgse, Cnikg
        //Your friend, Alice
        //A-2,t-5,v-1,t-2 h-2,r-0,q-8,g-2,s-5,e-1, C-2,n-2,i-0,k-8,g-2
        //2512208
        return pattern;

    }

    public static void main(String[] args) {
        findPattern fp = new findPattern();
        System.out.println(fp.decrypt("Otjfvknou kskgnl, K mbxg iurtsvcnb ksgq hoz atv. Vje xcxtyqrl vt ujg smewfv vrmcxvtg rwqr ju vhm ytsf elwepuqyez. -Atvt hrqgse, Cnikg","Your friend, Alice"));
    }
}
