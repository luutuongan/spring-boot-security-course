package com.example.demo.security;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet(ApplicationUserPermission.STUDENT_WRITE, ApplicationUserPermission.STUDENT_READ, ApplicationUserPermission.COURSE_READ)),
    ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,ApplicationUserPermission.COURSE_WRITE,ApplicationUserPermission.STUDENT_READ,ApplicationUserPermission.STUDENT_WRITE));

    private final Set<ApplicationUserPermission> applicationUserPermissionSet;

    ApplicationUserRole(Set<ApplicationUserPermission> applicationUserPermission) {
        this.applicationUserPermissionSet = applicationUserPermission;
    }

    Set<ApplicationUserPermission> getApplicationUserPermission() {
        return applicationUserPermissionSet;
    }
}
