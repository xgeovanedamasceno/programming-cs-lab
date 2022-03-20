class Song(object):
    lyrics = 0

    def __init__(self, lyrics):
        self.lyrics = lyrics

    def sing_me_a_song(self):
        for line in self.lyrics:
            print(line)

    
lyricsOne = ["Happy birthday to you",
            "I don't want to get sued",
            "So I'll stop right there."]

happy_bday = Song(lyricsOne)


lyricsTwo = ["They rally around the family",
                        "With pockets full of shells"]

bulls_on_parade = Song(lyricsTwo)

happy_bday.sing_me_a_song()

bulls_on_parade.sing_me_a_song()

print(happy_bday.lyrics)

happy_bday.lyrics = "It's pick it's pick"

print(happy_bday.lyrics)

