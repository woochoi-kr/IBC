package www.IBC.co.kr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.IBC.co.kr.domain.InstitutionInfoVO;

public interface InstitutionInfoMapper {
	
	//학원정보등록
	public int registerInfo(InstitutionInfoVO vo);
	
	//학원정보수정
	public int modifyInfo(InstitutionInfoVO vo);
	
	//학원정보삭제
	public int removeInfo(Long ino);

	//학원검색 (지역별 || 과목별 )
	public List<InstitutionInfoVO> searchInfo(@Param("area") String area, @Param("subject") String subject);
	
	//학원정보 페이징 목록
	public List<InstitutionInfoVO> list(@Param("currentpage") int currentpage,@Param("amount") int amount);
	
	//총 학원개수
	public int listCount();
	

}
