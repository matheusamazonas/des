// Matheus Andrade and Alan Andrade

#include "app.h"

#define DURATION 200

void play_note_for(float note, int duration)
{
	ev3_speaker_play_tone(note, duration);
	dly_tsk(duration);
}

/* Never gonna give you up, never gonna let you down
Never gonna run around and desert you */
void roll()
{
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_D4, DURATION);
	play_note_for(NOTE_E4, DURATION);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_A4, DURATION*2);
	play_note_for(NOTE_A4, DURATION*2);
	play_note_for(NOTE_G4, DURATION*4);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_D4, DURATION);
	play_note_for(NOTE_E4, DURATION);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_G4, DURATION*2);
	play_note_for(NOTE_G4, DURATION*2);
	play_note_for(NOTE_F4, DURATION*4);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_D4, DURATION);
	play_note_for(NOTE_E4, DURATION);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_F4, DURATION*2);
	play_note_for(NOTE_G4, DURATION);
	play_note_for(NOTE_E4, DURATION);
	play_note_for(NOTE_C4, DURATION*2);
	play_note_for(NOTE_C4, DURATION);
	play_note_for(NOTE_G4, DURATION*2);
	play_note_for(NOTE_F4, DURATION*6);
}

