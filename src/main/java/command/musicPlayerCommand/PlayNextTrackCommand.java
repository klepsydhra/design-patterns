package command.musicPlayerCommand;

import command.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
