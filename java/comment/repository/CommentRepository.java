package comment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comment.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
	public List<Comment> findBypostNum(int num);	//게시글 조회 할 떄 댓글도 불러오기
	@Transactional
	public void deleteAllBypostNum(int num);		//게시글 삭제 될때 댓글도 같이 삭제
}
