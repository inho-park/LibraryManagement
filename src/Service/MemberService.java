package Service;

import domain.LoginDTO;
import mapper.MemberMapper;

public class MemberService {
    private static MemberMapper mapper = new MemberMapper();

    public LoginDTO login(LoginDTO dto) {
        return mapper.read(dto);
    }
}
