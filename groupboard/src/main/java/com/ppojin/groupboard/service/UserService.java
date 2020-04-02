package com.ppojin.groupboard.service;


import com.ppojin.groupboard.domain.LoginDTO;
import com.ppojin.groupboard.domain.UserVO;

public interface UserService {
    // 회원 가입 처리
    void register(UserVO userVO) throws Exception;
    // 로그인 처리
    UserVO login(LoginDTO loginDTO) throws Exception;
}
