<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>排行榜</title>
    <link rel="stylesheet" href="./assets/css/rank.css">
    <link rel="stylesheet" href="./assets/css/header.css">
    <script src="assets/js/jquery.js"></script>
        <script src="assets/js/index.js"></script>
    <script src="assets/js/validate.js"></script>
    
</head>
<body>

<!-- 导航栏 -->
<script>
        $(function () {
            $('.uh').hover(function () {
                $('.pull').css("display","block")
            },function () {
                $('.pull').css("display","none")
                }
            )


            $('.pull').hover(function () {
                $('.pull').css("display","block")
            },function () {
                $('.pull').css("display","none")
            })
        })


    </script>
	<header>
    <div class="top">
        <div class="left">
            <div class="logo"><a href=""></a></div>
            <div class="option">
                <div><a href="/music/index">发现音乐</a></div>
                <div><a href="/music/myMusic?userid=${user.getId() }">我的音乐</a></div>
                <div><a href="/music/MV">发现视频</a></div>
                <div><a href="/music/rank">热门排行榜</a></div>
            </div>
        </div>
        <div class="right">
            <a href="/music/search" class="seek" >音乐/视频/用户</a>
            <div class="loginButton" style="display:${none}">
                <a href="javascript:;">用户登陆</a>           
            </div>
           <div class="uh" style="display:${block}">

               <a style="color:none"><img class="userHeader"  src="${user.getHeader()}"></img></a>
            </div>
            	

    	</div>
    	
    	<div class="pull">
            <div class="loginOut" >
                <a  href="/music/myHome">我的主页</a>
            </div>

            <div class="loginOut" >
                <a href="/music/vip">VIP会员</a>
            </div>
            <div class="loginOut" >
                <a href="/music/edit">个人设置</a>
            </div>
            <div class="loginOut" >
                <a href="/music/loginOut">退出</a>
            </div>
        </div>
    	
	</div>

</header>

<!--排行榜-->
<div class="rank-box">
    <div class="rank">
        <!--榜单-->
        <div class="rank-one">
            <div class="rank-feature">
                <div class="rank-feature-text">云音乐特色榜</div>
            </div>
            <ul class="rank-feature-list">
                <li class="rank-feature-li-1 li">
                    <div class="rank-feature-img">
                        <img src="./assets/images/6.jpg" alt="正在加载">
                    </div>
                    <div class="rank-feature-t1">云音乐飙升榜</div>
                    <div class="rank-feature-t2">每天更新</div>
                </li>
                <li class="rank-feature-li li">
                    <div class="rank-feature-img">
                        <img src="./assets/images/7.jpg" alt="正在加载">
                    </div>
                    <div class="rank-feature-t1">云音乐新歌榜</div>
                    <div class="rank-feature-t2">每天更新</div>
                </li>
                <li class="rank-feature-li li">
                    <div class="rank-feature-img">
                        <img src="./assets/images/8.jpg" alt="正在加载">
                    </div>
                    <div class="rank-feature-t1">网易原创歌曲榜</div>
                    <div class="rank-feature-t2">每天更新</div>
                </li>
                <li class="rank-feature-li li">
                    <div class="rank-feature-img">
                        <img src="./assets/images/9.jpg" alt="正在加载">
                    </div>
                    <div class="rank-feature-t1">云音乐热歌榜</div>
                    <div class="rank-feature-t2">每天更新</div>
                </li>
            </ul>
        </div>
        <!--榜单中的歌曲-->
        <div class="rank-two view">
            <div class="rank-title">
                <div class="rank-title-img">
                    <img src="./assets/images/15.jpg" alt="">
                </div>
                <div class="rank-title-name">云音乐飙升榜</div>
                <div class="rank-title-create">最近更新: &nbsp;${today }</div>
                <div class="rank-title-create1">(每天更新)</div>
                <div class="rank-title-img1">
                    <img src="./assets/images/24.png" alt="">
                </div>
                <div class="rank-title-img2">
                    <img src="./assets/images/27.png" alt="">
                </div>
                <div class="rank-title-img3">
                    <img src="./assets/images/29.png" alt="">
                </div>
                <div class="rank-title-img4">
                    <img src="./assets/images/1.png" alt="">
                </div>
            </div>
            <div class="rank-list">
                <div class="rank-list1">
                    <div class="rank-11">
                        <div class="rank-11-1">歌曲列表</div>
                        <div class="rank-11-2">${newHotSongs.size() }首歌</div>
                        <div class="rank-11-3">播放:
                            <span>${newHotSongsCount}</span>次
                        </div>
                    </div>
                    <div class="rank-12">
                        <div class="rank-12-1"></div>
                        <div class="rank-12-2">标题</div>
                        <div class="rank-12-3">时长</div>
                        <div class="rank-12-4">歌手</div>
                        <c:forEach items="${newHotSongs}" var="newHotSong" varStatus="id">
	                        <div class="rank-13">
	                            <div class="rank-13-1">
	                                <div class="rank-13-11">${id.count }</div>
	                                <!--<div class="rank-13-12"></div>-->
	                            </div>
	                            <a href="/music/play?songId=${newHotSong.getId()}"><div class="rank-13-2">${newHotSong.getSongName() }</div></a>
	                            <div class="rank-13-3">${newHotSong.getSongTime() }</div>
	                            <a href="javascript:;"><div class="rank-13-4">${newHotSong.getSongAuthor() }</div></a>
	                        </div>
                        </c:forEach>
                       
                    </div>
                </div>
            </div>
        </div>
        <div class="rank-three view">
            <div class="rank-title">
                <div class="rank-title-img">
                    <img src="./assets/images/16.jpg" alt="">
                </div>
                <div class="rank-title-name">云音乐新歌榜</div>
                <div class="rank-title-create">最近更新: &nbsp;${today }</div>
                <div class="rank-title-create1">(每天更新)</div>
          <div class="rank-title-img1">
                    <img src="./assets/images/24.png" alt="">
                </div>
                <div class="rank-title-img2">
                    <img src="./assets/images/27.png" alt="">
                </div>
                <div class="rank-title-img3">
                    <img src="./assets/images/29.png" alt="">
                </div>
                <div class="rank-title-img4">
                    <img src="./assets/images/1.png" alt="">
                </div>
            </div>
            <div class="rank-list">
                <div class="rank-list1">
                    <div class="rank-11">
                        <div class="rank-11-1">歌曲列表</div>
                        <div class="rank-11-2">${newSongs.size() }首歌</div>
                        <div class="rank-11-3">播放:
                            <span>${newSongsCount}</span>次
                        </div>
                    </div>
                    <div class="rank-12">
                        <div class="rank-12-1"></div>
                        <div class="rank-12-2">标题</div>
                        <div class="rank-12-3">时长</div>
                        <div class="rank-12-4">歌手</div>
                        <c:forEach items="${newSongs}" var="newSong" varStatus="id">
	                        <div class="rank-13">
	                            <div class="rank-13-1">
	                                <div class="rank-13-11">${id.count}</div>
	                                <!--<div class="rank-13-12"></div>-->
	                            </div>
	                            <a href="/music/play?songId=${newSong.getId()}"><div class="rank-13-2">${newSong.getSongName() }</div></a>
	                            <div class="rank-13-3">${newSong.getSongTime() }</div>
	                            <a href="javascript:;"><div class="rank-13-4">${newSong.getSongAuthor() }</div></a>
	                        </div>
                        </c:forEach>
                       
                    </div>
                </div>
            </div>
        </div>
        <div class="rank-four view">
            <div class="rank-title">
                <div class="rank-title-img">
                    <img src="./assets/images/17.jpg" alt="">
                </div>
                <div class="rank-title-name">云音乐原创歌曲榜</div>
                <div class="rank-title-create">最近更新: &nbsp;${today }</div>
                <div class="rank-title-create1">(每天更新)</div>
                  <div class="rank-title-img1">
                    <img src="./assets/images/24.png" alt="">
                </div>
                <div class="rank-title-img2">
                    <img src="./assets/images/27.png" alt="">
                </div>
                <div class="rank-title-img3">
                    <img src="./assets/images/29.png" alt="">
                </div>
                <div class="rank-title-img4">
                    <img src="./assets/images/1.png" alt="">
                </div>
            </div>
          <div class="rank-list">
                <div class="rank-list1">
                    <div class="rank-11">
                        <div class="rank-11-1">歌曲列表</div>
                        <div class="rank-11-2">${originalSongs.size() }首歌</div>
                        <div class="rank-11-3">播放:
                            <span>${originalSongsCount}</span>次
                        </div>
                    </div>
                    <div class="rank-12">
                        <div class="rank-12-1"></div>
                        <div class="rank-12-2">标题</div>
                        <div class="rank-12-3">时长</div>
                        <div class="rank-12-4">歌手</div>
                        <c:forEach items="${originalSongs}" var="originalSong" varStatus="id">
	                        <div class="rank-13">
	                            <div class="rank-13-1">
	                                <div class="rank-13-11">${id.count}</div>
	                                <!--<div class="rank-13-12"></div>-->
	                            </div>
	                            <a href="/music/play?songId=${originalSong.getId()}"><div class="rank-13-2">${originalSong.getSongName() }</div></a>
	                            <div class="rank-13-3">${originalSong.getSongTime() }</div>
	                            <a href="javascript:;"><div class="rank-13-4">${originalSong.getSongAuthor() }</div></a>
	                        </div>
                        </c:forEach>
                       
                    </div>
                </div>
            </div>
        </div>
        <div class="rank-five view">
            <div class="rank-title">
                <div class="rank-title-img">
                    <img src="./assets/images/18.jpg" alt="">
                </div>
                <div class="rank-title-name">云音乐热歌榜</div>
                <div class="rank-title-create">最近更新: &nbsp;${today }</div>
                <div class="rank-title-create1">(每天更新)</div>
                  <div class="rank-title-img1">
                    <img src="./assets/images/24.png" alt="">
                </div>
                <div class="rank-title-img2">
                    <img src="./assets/images/27.png" alt="">
                </div>
                <div class="rank-title-img3">
                    <img src="./assets/images/29.png" alt="">
                </div>
                <div class="rank-title-img4">
                    <img src="./assets/images/1.png" alt="">
                </div>
            </div>
            <div class="rank-list">
                <div class="rank-list1">
                    <div class="rank-11">
                        <div class="rank-11-1">歌曲列表</div>
                        <div class="rank-11-2">${hotSongs.size() }首歌</div>
                        <div class="rank-11-3">播放:
                            <span>${hotSongsCount}</span>次
                        </div>
                    </div>
                    <div class="rank-12">
                        <div class="rank-12-1"></div>
                        <div class="rank-12-2">标题</div>
                        <div class="rank-12-3">时长</div>
                        <div class="rank-12-4">歌手</div>
                        <c:forEach items="${hotSongs}" var="hotSong" varStatus="id">
	                        <div class="rank-13">
	                            <div class="rank-13-1">
	                                <div class="rank-13-11">${id.count}</div>
	                                <!--<div class="rank-13-12"></div>-->
	                            </div>
	                            <a href="/music/play?songId=${hotSong.getId()}"><div class="rank-13-2">${hotSong.getSongName() }</div></a>
	                            <div class="rank-13-3">${hotSong.getSongTime() }</div>
	                            <a href="javascript:;"><div class="rank-13-4">${hotSong.getSongAuthor() }</div></a>
	                        </div>
                        </c:forEach>
                       
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $(function () {
        var li = $(".li")
        var view = $(".view")
        var lit = $(".rank-two")
        var num=0
        li.click(function () {

            num = li.index(this)

            li.css("background","#fff")
            li.eq(num).css("background","#dcdcdc")

            view.css("display","none")
            view.eq(num).css("display","block")

        })
    })
</script>
<script>
    	
    	
    	
    </script>
</body>
</html>