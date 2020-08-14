package com.norman.feed.repository.entity;

/** feed频道数据实体 */
public class TabItemInfo {
    /** tab导航id，唯一，不可重复 */
    public int id = -1;
    /** tab导航栏条目显示的文字 */
    public String name;
    /** 是否飘新0否1是 */
    public int newTip ;
    /** 是否可以删除 */
    public int canDelete;
    /** 频道非选中颜色 */
    public int normalColor;
    /** 频道选中颜色 */
    public int selectColor;
    /** 频道指示器颜色 */
    public int indicatorColor;
    /** 0未添加1已添加 */
    public int added = -1;

//    /**
//     * id相等表示两者是一个tab
//     *
//     * @param obj tab信息
//     * @return 是否相同
//     */
//    @Override
//    public boolean equals(Object obj) {
//        return obj instanceof TabItemInfo
//                && this.id==((TabItemInfo) obj).id;
//    }

//    /**
//     * 有效性检测
//     *
//     * @return true合法；false不合法
//     */
//    public boolean isValidate() {
//        // 1.检查ID是否为空
//        if (id==-1) {
//            return false;
//        }
//        // 2.检查标题文字个数，不得超过5个字，中文字符算1，英文字符算0.5，全角英文算1.
//        return !StringUtils.isEmpty(name) && Utils.getMixLength(name) <= ConstTab.MAX_LENGTH;
//    }





}
