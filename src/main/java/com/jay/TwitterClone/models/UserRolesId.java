package com.jay.TwitterClone.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserRolesId implements Serializable{
    private long user;
    private long role;

    public UserRolesId(){
        
    }

    public UserRolesId(long user, long role) {
        this.user = user;
        this.role = role;
    }

    @Override
    public int hashCode() {
    return 14;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        var that = (UserRolesId) obj;
        return (this.getRole() == that.getRole()) && (this.getUser() == that.getUser());
    }

    
}
