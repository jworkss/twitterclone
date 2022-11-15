package com.jay.TwitterClone.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userroles")
@IdClass(UserRolesId.class)
@Getter
@Setter
public class UserRoles implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleid")
    private Role role;

    public UserRoles() {

    }

    public UserRoles(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (UserRoles) obj;
        return (this.getRole() == null ? 0 : this.getRole().getId()) == (that.getRole() == null ? 0
                : that.getRole().getId()) &&
                ((this.getUser() == null ? 0 : this.getUser().getId()) == (that.getUser() == null ? 0
                        : that.getUser().getId()));
    }

}
