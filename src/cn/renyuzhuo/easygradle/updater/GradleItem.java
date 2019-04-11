package cn.renyuzhuo.easygradle.updater;

public class GradleItem {

    public String version;
    public String buildTime;
    public String rcFor;
    public String milestoneFor;
    public String downloadUrl;
    public String checksumUrl;
    public String wrapperChecksumUrl;

    public boolean current;
    public boolean snapshot;
    public boolean nightly;
    public boolean releaseNightly;
    public boolean activeRc;
    public boolean broken;

    public String toShowString() {
        return "最新版本 Gradle：" + version;
    }

    @Override
    public String toString() {
        return "GradleItem{" +
                "version='" + version + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", rcFor='" + rcFor + '\'' +
                ", milestoneFor='" + milestoneFor + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", checksumUrl='" + checksumUrl + '\'' +
                ", wrapperChecksumUrl='" + wrapperChecksumUrl + '\'' +
                ", current=" + current +
                ", snapshot=" + snapshot +
                ", nightly=" + nightly +
                ", releaseNightly=" + releaseNightly +
                ", activeRc=" + activeRc +
                ", broken=" + broken +
                '}';
    }
}
