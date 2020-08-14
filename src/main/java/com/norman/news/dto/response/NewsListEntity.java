package com.norman.news.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value="新闻列表",description="新闻列表每个item的实体类")
public class NewsListEntity {
    public String itemId;
    /** 频道码 */
    @ApiModelProperty(value="频道码",name="channelCode",example="1")
    public String channelCode;
    /** 频道名 */
    @ApiModelProperty(value="频道名",name="channel",example="娱乐")
    public String channel;
    /** 标题 */
    @ApiModelProperty(value="标题",name="title",example="26天，乞食徒步1200多公里，一个女居士的朝圣之旅")
    public String title;
    /** 作者名称 */
    @ApiModelProperty(value="作者名称",name="author",example="澎湃新闻")
    public String author;
    /** 作者头像地址 */
    @ApiModelProperty(value="作者头像地址",name="avatarUrl",example="/static/news_image/259883ef62bb40abb317bd8312899da1~120x256.image")
    public String avatarUrl;
    /** 作者认证信息 */
    @ApiModelProperty(value="作者认证信息",name="authorVerified",example="澎湃新闻官方账号")
    public String authorVerified;
    /** 作者描述信息 */
    @ApiModelProperty(value="作者描述信息",name="authorDescription",example="专注时政与思想的媒体开放平台")
    public String authorDescription;
    /** 评论数量 */
    @ApiModelProperty(value="评论数量",name="commentCount",example="99")
    public int commentCount;
    /** 新闻时间 */
    @ApiModelProperty(value="新闻时间",name="behotTime",example="1576233547")
    public long behotTime;
    /** 静态html地址 */
    @ApiModelProperty(value="静态html地址",name="url",example="/static/news_html/6769810781123904008.html")
    public String url;
    /** 新闻内容 */
    @ApiModelProperty(value="新闻内容",name="content",example="<p><strong>菏泽报业全媒体消息</strong>（记者 <strong>牛冲</strong>）记者从菏泽市公安局交通交警支队获悉，长江路铁路桥涵洞潮汐车道，经过半年时间的试运行，早晚高峰期内仍然出现短暂性交通拥堵，交警支队组织专业人员对该时段拥堵原因深入剖析，在原交通管控措施不变的情况下，对长江路铁路桥涵洞东、西进口进行交通组织优化调整，并将于<strong>2020年1月正式施工改造</strong>。</p><p><br/></p><div class=\"pgc-img\"><img src=\"http://p9.pstatp.com/large/pgc-image/029923d410dd4e6baa44798b5277ca91\" img_width=\"1122\" img_height=\"793\" inline=\"0\" alt=\"菏泽市区长江路铁路涵洞潮汐车道将于2020年1月进行施工改造\" onerror=\"javascript:errorimg.call(this);\"><p class=\"pgc-img-caption\"></p></div><p><strong> 东进口交通组织</strong></p><p>为提高潮汐车道通行速度，潮汐车道路段向东延伸至长沙路东侧，拆除部分中央隔离护栏，完善交通标志标线，详见东进口交通组织示意图（上图）；长沙路进入长江路采取相应的交通管制措施，北进口禁止机动车右转直接驶入长江路，可通过巢湖路绕行至长江路，并在主要出入口设置向右转弯标志和调头标志。南进口实行右进右出交通管制，右转机动车允许借非机动车道通行，并在进出口安装禁止左转标志和向右转弯标志；原长沙路行人过街斑马线清除，行人过街位置向东挪移至星月绿城处，重新施划斑马线，安装行人横道和让行标志，中央隔离护栏安装隔离桩，只允许行人和非机动车通行。机动车调头口由原来星月绿城附近向东调整至丁字路口处，增设调头标志，施划交通标线，完善交通安全设施。</p><div class=\"pgc-img\"><img src=\"http://p3.pstatp.com/large/pgc-image/910b926e64264041a96f69237a575813\" img_width=\"1122\" img_height=\"793\" inline=\"0\" alt=\"菏泽市区长江路铁路涵洞潮汐车道将于2020年1月进行施工改造\" onerror=\"javascript:errorimg.call(this);\"><p class=\"pgc-img-caption\"></p></div><p><strong>西进口交通组织</strong></p><p>潮汐车道向西延伸至机非绿化带位置，重新完善交通标志标线。南侧在烟草公司附近设置一处护栏开口，并实行右进右出交通管制。北侧小区出入口设置一处护栏开口，实行右进右出交通管制，并安装右转车道可借道通行标志。详见西进口交通组织示意图（上图）。</p><p>该项措施将于<strong>2020年1月正式施工改造</strong>，原铁路桥涵洞内电子警察抓拍正常使用，敬请驾驶员朋友注意。</p><p><strong>相关链接</strong></p><p>菏泽市公安局交通交警支队通过实地调研和路段交通流量统计分析，长江路铁路涵洞交通流向具有明显的潮汐现象，早高峰自西向东出城方向交通流量较大，晚高峰自东向西进城方向交通流量较大。自2019年6月12日长江路铁路桥涵洞潮汐车道试运行以来，早高峰路段通行能力由2874辆提高到3641辆，晚高峰路段通行能力由2527辆提高到3105辆，路段行程速度由22km/h提高到31km/h，通行能力提高了27%，通行效率提高了46%。</p>")
    public String content;
    /** 新闻中图片数量 */
    @ApiModelProperty(value="新闻中图片数量",name="gallaryImageCount",example="2")
    public int gallaryImageCount;
    /** 布局类型 */
    @ApiModelProperty(value="布局类型",name="layoutType",example="2")
    public int layoutType;
    /** 图片地址 */
    @ApiModelProperty(value="图片地址",name="imageUrlList",example="[\n" +
            "    \"/static/news_image/1e7f1bbb73d244b7930bd7bdf8455250~tplv-tt-cs0:300:196.webp\",\n" +
            "    \"/static/news_image/314df6ee555e48a58b0cba2d961cd928~tplv-tt-cs0:300:196.webp\",\n" +
            "    \"/static/news_image/5a1284e6d8b4400e8cf78a1ce75dc6c7~tplv-tt-cs0:300:196.webp\"\n" +
            "]")
    public List<String> imageUrlList;
}
