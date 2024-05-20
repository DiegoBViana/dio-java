public class SmartTv {
  private boolean status = false;
  private int channel = 1;
  private int volume = 25;

  public void SmartTv() {
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus() {
    this.status = !status;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannelUp() {
    this.channel++;
  }

  public void setChannelDown() {
    this.channel--;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolumeDown() {
    if (this.volume <= 0) {
      this.volume = 0;
    } else {
      this.volume--;
    }
  }

  public void setVolumeUp() {
    if (this.volume >= 100) {
      this.volume = 100;
    } else {
      this.volume++;
    }
  }

  @Override
  public String toString() {
    if (!this.status) {
      return "SmartTv: " + isStatus();
    }
    return "SmartTv: " + isStatus() + " at Channel: " + getChannel() + ", and Volume:" + getVolume();
  }

}
