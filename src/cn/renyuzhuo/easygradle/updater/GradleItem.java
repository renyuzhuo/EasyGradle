package cn.renyuzhuo.easygradle.updater;

public class GradleItem {
    private String version;
    private String buildTime;
    private boolean current;
    private boolean snapshot;
    private boolean nightly;
    private boolean releaseNightly;
    private boolean activeRc;
    private String rcFor;
    private String milestoneFor;
    private boolean broken;
    private String downloadUrl;
    private String checksumUrl;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public boolean getCurrent() {
        return current;
    }

    public void setSnapshot(boolean snapshot) {
        this.snapshot = snapshot;
    }

    public boolean getSnapshot() {
        return snapshot;
    }

    public void setNightly(boolean nightly) {
        this.nightly = nightly;
    }

    public boolean getNightly() {
        return nightly;
    }

    public void setReleaseNightly(boolean releaseNightly) {
        this.releaseNightly = releaseNightly;
    }

    public boolean getReleaseNightly() {
        return releaseNightly;
    }

    public void setActiveRc(boolean activeRc) {
        this.activeRc = activeRc;
    }

    public boolean getActiveRc() {
        return activeRc;
    }

    public void setRcFor(String rcFor) {
        this.rcFor = rcFor;
    }

    public String getRcFor() {
        return rcFor;
    }

    public void setMilestoneFor(String milestoneFor) {
        this.milestoneFor = milestoneFor;
    }

    public String getMilestoneFor() {
        return milestoneFor;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public boolean getBroken() {
        return broken;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setChecksumUrl(String checksumUrl) {
        this.checksumUrl = checksumUrl;
    }

    public String getChecksumUrl() {
        return checksumUrl;
    }

    @Override
    public String toString() {
        return "" + version;
    }
}
