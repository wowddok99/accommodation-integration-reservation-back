package tour_recommend.tour_recommend_back.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import tour_recommend.tour_recommend_back.entity.estimate_talk.EstimateTalkComment;

public interface EstimateTalkCommentRepository extends JpaRepository<EstimateTalkComment, Long> {
    Page<EstimateTalkComment> findByEstimateTalkPostId(Long postId, PageRequest pageRequest);
}
