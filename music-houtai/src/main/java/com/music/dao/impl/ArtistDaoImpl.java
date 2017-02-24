package com.music.dao.impl;

import java.util.List;

import com.music.dao.ArtistDao;
import com.music.entity.Artist;
/**
 * 
 * @author Forever
 * @version 1.0
 */

public class ArtistDaoImpl extends BaseDao implements ArtistDao {
	//添加歌手
	public Artist addArtist(Artist a) {
		return (Artist) addObject(a);
	}
	
	//删除歌手
	public boolean delArtist(Artist a) {
		return deleteObject(a);
	}
	
	//根据ID查找歌手
	public Artist findArtistById(int id) {
		return (Artist) executeQuery("from Artist where a_id="+id).get(0);
	}
	
	//修改歌手
	public boolean updateArtist(Artist a) {
		return updateObject(a);
	}
	//查看全部歌手
	public List findAllArtist() {
		return executeQuery("from Artist order by p_date desc");
	}
	
}
