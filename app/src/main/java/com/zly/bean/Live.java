package com.zly.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Live implements Serializable{

    /**
     * result : {"list":[{"created_at":1502796922487,"updated_at":1502796950510,"id":1388403913457677,"data":{"live_name":"看看","pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg","live_type":0,"status":1},"uid":1388402537725964,"user":{"user_data":{"user_name":"羊大爷","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"18799520104"},"id":1388402537725964,"created_at":1502796840015,"updated_at":1502796840053}},{"created_at":1502794551463,"updated_at":1502794555050,"id":1388364134678539,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg","live_name":"人与人"},"uid":1387931819376643,"user":{"user_data":{"user_name":"小元最帅","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"一嘴毛"},"id":1387931819376643,"created_at":1502768783685,"updated_at":1502768783701}},{"created_at":1502792446598,"updated_at":1502792460623,"id":1388328818638857,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg","live_name":"用"},"uid":1387930930184194,"user":{"user_data":{"user_name":"wang","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"哈哈哈"},"id":1387930930184194,"created_at":1502768730360,"updated_at":1502768730397}},{"created_at":1501333612683,"updated_at":1501333651053,"id":1363853645512705,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097746&di=4b17a1b6b9da3a6818177f33fabebf31&imgtype=0&src=http%3A%2F%2Fimg1.gamersky.com%2Fimage2015%2F04%2F20150408zwc_7%2Fimage021_S.jpg","live_name":"666"},"uid":1222813982720099,"user":{"user_data":{"user_name":"邢子岩","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"我叫邢子岩"},"id":1222813982720099,"created_at":1492926993366,"updated_at":1492926993397}},{"created_at":1499937329322,"updated_at":1499937329507,"id":1340427904024577,"data":{"live_name":"rt","pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg","live_type":0,"status":0},"uid":1333159040974849,"user":{"user_data":{"user_name":"hsja","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"ahhhj"},"id":1333159040974849,"created_at":1499504071257,"updated_at":1499504071289}},{"created_at":1489060085463,"updated_at":1498648556790,"id":1157938031951875,"data":{"status":1,"live_name":"马泽宇直播","pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489070127924&di=1265b69c4092d0f9c4be4095eead6021&imgtype=0&src=http%3A%2F%2Fa.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fca1349540923dd54261fa262d309b3de9c82484f.jpg","live_type":0},"uid":1157677280460801,"user":{"user_data":{"user_name":"小源","avatar":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489639863137&di=d33fd6e1ab1d1959e4d5c011fe0e93d7&imgtype=0&src=http%3A%2F%2Fimg2.touxiang.cn%2Ffile%2F20160330%2F025d57c8e840fb9aa71d839d368688fe.jpg","sign":"我就是不一样的烟火a"},"id":1157677280460801,"created_at":1489044543163,"updated_at":1489629804387}},{"created_at":1498383956826,"updated_at":1498383990204,"id":1314366629675011,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097749&di=44c8dce130d718071bcefc508c2ffb6f&imgtype=0&src=http%3A%2F%2Fq.115.com%2Fimgload%3Fr%3DADFCE0A0CBCDD585454FECD908C3215E7BDBEC9B%26u%3DwNnOPm%26s%3DsibMXXEQjUHME4hUTToiMQ%26e%3D5%26st%3D0","live_name":"小源直播"},"uid":1297895899856897,"user":{"user_data":{"user_name":"xiaoyuan","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"123456"},"id":1297895899856897,"created_at":1497402224604,"updated_at":1497402224636}},{"created_at":1489060118617,"updated_at":1498381590000,"id":1157938585600004,"data":{"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489070127921&di=b7193a4b0f083fb5e54310e4f2836f4f&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fdbb44aed2e738bd4770bcc30a38b87d6277ff98d.jpg","live_name":"杨文静直播","status":1},"uid":1157677280460801,"user":{"user_data":{"user_name":"小源","avatar":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489639863137&di=d33fd6e1ab1d1959e4d5c011fe0e93d7&imgtype=0&src=http%3A%2F%2Fimg2.touxiang.cn%2Ffile%2F20160330%2F025d57c8e840fb9aa71d839d368688fe.jpg","sign":"我就是不一样的烟火a"},"id":1157677280460801,"created_at":1489044543163,"updated_at":1489629804387}},{"created_at":1498121638386,"updated_at":1498121657793,"id":1309965663928321,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097746&di=4b17a1b6b9da3a6818177f33fabebf31&imgtype=0&src=http%3A%2F%2Fimg1.gamersky.com%2Fimage2015%2F04%2F20150408zwc_7%2Fimage021_S.jpg","live_name":"yangzai"},"uid":1223165163405451,"user":{"user_data":{"user_name":"哈哈","avatar":"http://ofdx4t772.bkt.clouddn.com/1223164861415562?imageView2/1/w/300/h/300","sign":"生活美好"},"id":1223165163405451,"created_at":1492947925540,"updated_at":1492947925580}},{"created_at":1497942266273,"updated_at":1497942296621,"id":1306956301139970,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097748&di=727e483a3ad03951b22b6b4e51ea2039&imgtype=0&src=http%3A%2F%2Fattimg.dospy.com%2Fimg%2Fday_110719%2F20110719_7f2ed5138ca5ea16b17eKJMcApTUtDJN.jpg","live_name":"阿"},"uid":1306955781046273,"user":{"user_data":{"user_name":"17600939514","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"好"},"id":1306955781046273,"created_at":1497942235889,"updated_at":1497942235931}},{"created_at":1497875125333,"updated_at":1497875166844,"id":1305829862080519,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097748&di=727e483a3ad03951b22b6b4e51ea2039&imgtype=0&src=http%3A%2F%2Fattimg.dospy.com%2Fimg%2Fday_110719%2F20110719_7f2ed5138ca5ea16b17eKJMcApTUtDJN.jpg","live_name":"我是你爸"},"uid":1305828788338694,"user":{"user_data":{"user_name":"123","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"123"},"id":1305828788338694,"created_at":1497875061093,"updated_at":1497875061154}},{"created_at":1497792047679,"updated_at":1497792089246,"id":1304436044529665,"data":{"status":1,"live_type":0,"pic":"http://img4.imgtn.bdimg.com/it/u=3547796456,889162116&fm=23&gp=0.jpg","live_name":"是"},"uid":1294993005281281,"user":{"user_data":{"user_name":"1\n1","avatar":"http://img4.imgtn.bdimg.com/it/u=3547796456,889162116&fm=23&gp=0.jpg","sign":"僵僵：\u201c我是单身僵啊，好巧吧，那我们一起吖\u201d。  XX：\u201c那你也吃草啊？\u201d "},"id":1294993005281281,"created_at":1497229198088,"updated_at":1497229198131}},{"created_at":1497508285688,"updated_at":1497694962517,"id":1299675308163075,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097749&di=44c8dce130d718071bcefc508c2ffb6f&imgtype=0&src=http%3A%2F%2Fq.115.com%2Fimgload%3Fr%3DADFCE0A0CBCDD585454FECD908C3215E7BDBEC9B%26u%3DwNnOPm%26s%3DsibMXXEQjUHME4hUTToiMQ%26e%3D5%26st%3D0","live_name":"我叫陈伟"},"uid":1299674754514946,"user":{"user_data":{"user_name":"陈伟","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"我就是我"},"id":1299674754514946,"created_at":1497508252286,"updated_at":1497508252336}},{"created_at":1497596985119,"updated_at":1497596993165,"id":1301163447222277,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097749&di=91358f4b4f0b5d31b9b0f4563e7d9f55&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3De0256a9a740e0cf3a0f74ef33a47f23d%2Fc63cfaedab64034f0887058ea9c379310b551d33.jpg","live_name":"我叫小源"},"uid":1297895899856897,"user":{"user_data":{"user_name":"xiaoyuan","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"123456"},"id":1297895899856897,"created_at":1497402224604,"updated_at":1497402224636}},{"created_at":1497587260996,"updated_at":1497587288320,"id":1301000288796673,"data":{"status":1,"live_type":0,"pic":"http://ofdx4t772.bkt.clouddn.com/1224395319214135?imageView2","live_name":"我是邢紫岩爸爸"},"uid":1222813982720099,"user":{"user_data":{"user_name":"邢子岩","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"我叫邢子岩"},"id":1222813982720099,"created_at":1492926993366,"updated_at":1492926993397}},{"created_at":1497532443794,"updated_at":1497532457825,"id":1300080612147205,"data":{"status":1,"live_type":0,"pic":"http://ofdx4t772.bkt.clouddn.com/1224395319214135?imageView2","live_name":"？"},"uid":1222813982720099,"user":{"user_data":{"user_name":"邢子岩","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"我叫邢子岩"},"id":1222813982720099,"created_at":1492926993366,"updated_at":1492926993397}},{"created_at":1497528605757,"updated_at":1497528605887,"id":1300016221192196,"data":{"live_name":"噶啥","pic":"http://ofdx4t772.bkt.clouddn.com/1224395319214135?imageView2","live_type":0,"status":0},"uid":1222813982720099,"user":{"user_data":{"user_name":"邢子岩","avatar":"http://ofdx4t772.bkt.clouddn.com/1222654313955418?imageView2","sign":"我叫邢子岩"},"id":1222813982720099,"created_at":1492926993366,"updated_at":1492926993397}},{"created_at":1497503630554,"updated_at":1497503644691,"id":1299597210222593,"data":{"status":1,"live_type":0,"pic":"https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=763856467,4231999936&fm=23&gp=0.jpg","live_name":"测试一下直播"},"uid":1157677280460801,"user":{"user_data":{"user_name":"小源","avatar":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489639863137&di=d33fd6e1ab1d1959e4d5c011fe0e93d7&imgtype=0&src=http%3A%2F%2Fimg2.touxiang.cn%2Ffile%2F20160330%2F025d57c8e840fb9aa71d839d368688fe.jpg","sign":"我就是不一样的烟火a"},"id":1157677280460801,"created_at":1489044543163,"updated_at":1489629804387}},{"created_at":1497229898360,"updated_at":1497229932121,"id":1295004749332482,"data":{"status":1,"live_type":0,"pic":"http://img4.imgtn.bdimg.com/it/u=3547796456,889162116&fm=23&gp=0.jpg","live_name":"尼玛德"},"uid":1294993005281281,"user":{"user_data":{"user_name":"1\n1","avatar":"http://img4.imgtn.bdimg.com/it/u=3547796456,889162116&fm=23&gp=0.jpg","sign":"僵僵：\u201c我是单身僵啊，好巧吧，那我们一起吖\u201d。  XX：\u201c那你也吃草啊？\u201d "},"id":1294993005281281,"created_at":1497229198088,"updated_at":1497229198131}},{"created_at":1495108881560,"updated_at":1495108883717,"id":1259419988983818,"data":{"status":1,"live_type":0,"pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489589097746&di=4b17a1b6b9da3a6818177f33fabebf31&imgtype=0&src=http%3A%2F%2Fimg1.gamersky.com%2Fimage2015%2F04%2F20150408zwc_7%2Fimage021_S.jpg","live_name":"组撒"},"uid":1256445036265473,"user":{"user_data":{"user_name":"a","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"qwe"},"id":1256445036265473,"created_at":1494931560688,"updated_at":1494931560835}}]}
     * error_code : 0
     */

    private ResultBean result;
    private int error_code;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * created_at : 1502796922487
             * updated_at : 1502796950510
             * id : 1388403913457677
             * data : {"live_name":"看看","pic":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg","live_type":0,"status":1}
             * uid : 1388402537725964
             * user : {"user_data":{"user_name":"羊大爷","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"18799520104"},"id":1388402537725964,"created_at":1502796840015,"updated_at":1502796840053}
             */

            private long created_at;
            private long updated_at;
            private long id;
            private DataBean data;
            private long uid;
            private UserBean user;

            public long getCreated_at() {
                return created_at;
            }

            public void setCreated_at(long created_at) {
                this.created_at = created_at;
            }

            public long getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(long updated_at) {
                this.updated_at = updated_at;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public long getUid() {
                return uid;
            }

            public void setUid(long uid) {
                this.uid = uid;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public static class DataBean {
                /**
                 * live_name : 看看
                 * pic : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1499052935&di=4b43075864539f827ea7abe846856be8&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.beicai.com%2Fbm%2Ffiles%2Flogo.jpg
                 * live_type : 0
                 * status : 1
                 */

                private String live_name;
                private String pic;
                private int live_type;
                private int status;

                public String getLive_name() {
                    return live_name;
                }

                public void setLive_name(String live_name) {
                    this.live_name = live_name;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public int getLive_type() {
                    return live_type;
                }

                public void setLive_type(int live_type) {
                    this.live_type = live_type;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }
            }

            public static class UserBean {
                /**
                 * user_data : {"user_name":"羊大爷","avatar":"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg","sign":"18799520104"}
                 * id : 1388402537725964
                 * created_at : 1502796840015
                 * updated_at : 1502796840053
                 */

                private UserDataBean user_data;
                private long id;
                private long created_at;
                private long updated_at;

                public UserDataBean getUser_data() {
                    return user_data;
                }

                public void setUser_data(UserDataBean user_data) {
                    this.user_data = user_data;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public long getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(long created_at) {
                    this.created_at = created_at;
                }

                public long getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(long updated_at) {
                    this.updated_at = updated_at;
                }

                public static class UserDataBean {
                    /**
                     * user_name : 羊大爷
                     * avatar : https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2608404801,4206400884&f=23&gp=0.jpg
                     * sign : 18799520104
                     */

                    private String user_name;
                    private String avatar;
                    private String sign;

                    public String getUser_name() {
                        return user_name;
                    }

                    public void setUser_name(String user_name) {
                        this.user_name = user_name;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getSign() {
                        return sign;
                    }

                    public void setSign(String sign) {
                        this.sign = sign;
                    }
                }
            }
        }
    }
}
