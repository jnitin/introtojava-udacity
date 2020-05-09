package com.udacity.intotojava;

// JAVA program to check whether two strings
// are anagrams of each other
import java.util.Arrays;
public class Main {

    // Driver code
    public static void main (String[] args)
    {
        ContactManager cm = new ContactManager();

        Contact c1= new Contact("Tom","tom@email.com","001");
        cm.addFriend(c1);

        Contact c2 = new Contact("Dick","dick@email.com","002");
        cm.addFriend(c2);

        Contact c3 = new Contact("Harry","harry@email.com","003");
        cm.addFriend(c3);

        Contact foundFreind = cm.searchFriend("Harry");
        if(foundFreind != null) {
            System.out.println("Contact Details\n" + "Name:" + foundFreind.name +
                    " Email: " + foundFreind.email + " Phone: " + foundFreind.phone);
        }else {
            System.out.println("Friend not found ");
        }


    }
    /* Iterative function to reverse
        digits of num*/
    static int reversDigits(int num)
    {
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
    /* function to check whether two strings are
  anagram of each other */
    static boolean areAnagram(String str1, String str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length();
        int n2 = str2.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        char []cstr1 = str1.toCharArray();
        char []cstr2 = str2.toCharArray();

        // Sort both strings
        Arrays.sort(cstr1);
        Arrays.sort(cstr2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (cstr1[i] != cstr2[i])
                return false;

        return true;
    }

}
