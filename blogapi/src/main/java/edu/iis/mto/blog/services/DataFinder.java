package edu.iis.mto.blog.services;

import java.util.List;

import edu.iis.mto.blog.domain.model.AccountStatus;
import edu.iis.mto.blog.dto.PostData;
import edu.iis.mto.blog.dto.UserData;

public interface DataFinder {

    UserData getUserData(Long userId);

    List<UserData> findUsers(String searchString);

    PostData getPost(Long userId);

    List<PostData> getUserPosts(Long userId);

	AccountStatus getUserAccountStatus(Long userId);

}
