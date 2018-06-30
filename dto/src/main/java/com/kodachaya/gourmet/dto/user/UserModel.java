package com.kodachaya.gourmet.dto.user;

import java.util.Objects;

public class UserModel {

    private int id;
    private String username;
    private String profileImage;
    private int stampCount;
    private int wishCount;
    private int followingCount;
    private int follwerCount;
    private boolean isFollowing;
    private boolean isPublic;

    public UserModel(int id, String username, String profileImage, int stampCount, int wishCount, int followingCount, int follwerCount, boolean isFollowing, boolean isPublic) {
        this.id = id;
        this.username = username;
        this.profileImage = profileImage;
        this.stampCount = stampCount;
        this.wishCount = wishCount;
        this.followingCount = followingCount;
        this.follwerCount = follwerCount;
        this.isFollowing = isFollowing;
        this.isPublic = isPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getStampCount() {
        return stampCount;
    }

    public void setStampCount(int stampCount) {
        this.stampCount = stampCount;
    }

    public int getWishCount() {
        return wishCount;
    }

    public void setWishCount(int wishCount) {
        this.wishCount = wishCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getFollwerCount() {
        return follwerCount;
    }

    public void setFollwerCount(int follwerCount) {
        this.follwerCount = follwerCount;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id &&
                stampCount == userModel.stampCount &&
                wishCount == userModel.wishCount &&
                followingCount == userModel.followingCount &&
                follwerCount == userModel.follwerCount &&
                isFollowing == userModel.isFollowing &&
                isPublic == userModel.isPublic &&
                Objects.equals(username, userModel.username) &&
                Objects.equals(profileImage, userModel.profileImage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, profileImage, stampCount, wishCount, followingCount, follwerCount, isFollowing, isPublic);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", stampCount=" + stampCount +
                ", wishCount=" + wishCount +
                ", followingCount=" + followingCount +
                ", follwerCount=" + follwerCount +
                ", isFollowing=" + isFollowing +
                ", isPublic=" + isPublic +
                '}';
    }
}
