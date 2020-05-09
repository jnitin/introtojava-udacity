package com.udacity.intotojava;

public class ContactManager {
    Contact [] myFriends;
    int friendscount;

    ContactManager(){
        this.friendscount = 0;
        this.myFriends = new Contact[100];
    }

    public void addFriend(Contact friend){
        myFriends[friendscount] = friend;
        friendscount++;
    }

    public Contact searchFriend(String name){
          for(int i = 0;i < friendscount;i++ ){
            if(myFriends[i].name.equals(name)){
                return myFriends[i];
            }
        }
        return null;
    }
}
