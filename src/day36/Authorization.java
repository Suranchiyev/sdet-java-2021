package day36;

import java.util.ArrayList;
import java.util.List;

public class Authorization {
	private List<Permission> permissions;
	private List<User> users;
	
	public Authorization(List<Permission> permissions, List<User> users) {
		this.permissions = permissions;
		this.users = users;
	}
	
	/**
	 * We want to be able to get a list of all permissions that particular user
	 * has. A user has any permission that matches one of the roles that they
	 * have.
	 * 
	 * Write a function that takes a user id and returns the list of strings
	 * matching the names of permissions that user has. If the user cannot
	 * be founded or user has no permissions, then return empty list.
	 * 
	 * Additionally, each permission is either active or inactive, and we should 
	 * not return permissions that are inactive.
	 * 
	 */
	public List<String> listPermissions(int userId) {
		List<String> listPermissions = new ArrayList<>();
		List<String> userRoles = new ArrayList<>();
		
		for (User user : users) {
			if (user.id == userId) {
				userRoles = user.roles;
			}
		}
		for (Permission permission : permissions) {
			if (userRoles.contains(permission.role) && permission.active) {
				listPermissions.add(permission.name);
			}
		}
		return listPermissions;
	}
	
	/**
	 * We also want to be able to ensure that users aren't trying to use
	 * permissions they don't have.
	 * 
	 * Write a function that takes a user id and permission name and returns
	 * true if the user has that permission. Return false otherwise. The rules
	 * for whether a user has a permission are the same as the List Permissions
	 * function (including active/inactive handling). If the user or permission
	 * cannot be found, return false
	 */
	public boolean checkPermitted(String permissionName, int userId) {
		List<String> listPermissions = listPermissions(userId);
		return listPermissions.contains(permissionName);
	}
	
}

class Permission {
	public String role;
	public String name;
	public boolean active;
	
	public Permission() {}
	
	public Permission(String role, String name, boolean active) {
		this.role = role;
		this.name = name;
		this.active = active;
	}
}

class User {
	public int id;
	public String name;
	public List<String> roles;
	
	public User() {}
	
	public User(int id, String name, List<String> roles) {
		this.id = id;
		this.name = name;
		this.roles = roles;
	}
}
