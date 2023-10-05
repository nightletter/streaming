package me.nightletter.video.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_VIDEO")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Video {

	@Id
	private Long videoId;
	private String link;

	public Video( Long videoId, String link ) {
		this.videoId = videoId;
		this.link = link;
	}
}
