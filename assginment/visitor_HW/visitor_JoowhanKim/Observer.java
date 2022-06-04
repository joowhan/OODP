public interface Observer {
    public abstract void update(String status);
    public abstract String getLog();
    public abstract void update_sr(String status);
    public abstract void update_sw(String status);
}
