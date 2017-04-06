package cn.creditease.constant;

/**
 * @author ：xiaopingzhang8@creditease.cn
 * @Description ：交易常量
 * @ClassName ：BizCode
 * @date ：2017/3/1 10:47
 */
public class BizCode {
    /**
     * 交易状态枚举类
     */
    public enum BizStatus {
        STATUS_OK(0, "成功"),
        STATUS_FAIL(1, "失败");
        private int code;
        private String desc;

        BizStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
