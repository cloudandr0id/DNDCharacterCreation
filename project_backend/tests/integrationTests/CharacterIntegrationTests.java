

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

public class CharacterIntegrationTests
{

    @Mock
    Race expectedRace = new Race(1, "Human", 0, 30);

    @Mock
    Subrace expectedSubrace = new Subrace(1, "Norse Human");

    @Mock
    AbilityScore expectedAScore = new AbilityScore(10, 10, 10, 10, 10, 10);

    @Mock
    CharClass expectedClass = new CharClass(1, "Fighter", 1);

    @Mock
    Subclass expSubclass = new Subclass(1, "Kung Fu");

    @Mock
    Background expectedBackground = new Background(1, "Pirate", "Raised by Pirates");

    @Mock
    Level expectedLevel = new Level(5,10);

    @Mock
    Character expectedCharacter = new Character("Billy Bob", expectedRace, expectedSubrace, 
    expectedAScore, expectedClass, expSubclass, expectedBackground, expectedLevel);

    Character character = new Character();

    @Test
    public void evaluateName()
    {
        character.setName("Billy Bob");
        assertEquals(character.getName(), "Billy Bob");
    }

    @Test
    public void evaluateRace()
    {
        Race race = new Race();
        race.setRaceID(1);
        race.setRaceName("Human");
        race.setRaceTrait(0);
        race.setSpeed(30);

        character.setRace(race);
        assertEquals(character.getRace().getRaceID(), expectedRace.getRaceID());
        assertEquals(character.getRace().getRaceName(), expectedRace.getRaceName());
        assertEquals(character.getRace().getRaceTrait(), expectedRace.getRaceTrait());
        assertEquals(character.getRace().getSpeed(), expectedRace.getSpeed());
    }

    @Test
    public void evaluateSubrace()
    {
        Subrace subrace = new Subrace();
        subrace.setRaceID(1);
        subrace.setRaceName("Norse Human");

        character.setSubRace(subrace);
        assertEquals(character.getSubRace().getRaceID(), expectedSubrace.getRaceID());
        assertEquals(character.getSubRace().getRaceName(), expectedSubrace.getRaceName());

    }

    @Test
    public void evaluateAbilityScore()
    {
        AbilityScore aScore = new AbilityScore();
        aScore.setStr(10);
        aScore.setDex(10);
        aScore.setCon(10);
        aScore.setInt(10);
        aScore.setWis(10);
        aScore.setCha(10);
        
        character.setAbilityScore(aScore);
        assertEquals(character.getAbilityScore().getStr(), expectedAScore.getStr());
        assertEquals(character.getAbilityScore().getDex(), expectedAScore.getDex());
        assertEquals(character.getAbilityScore().getCon(), expectedAScore.getCon());
        assertEquals(character.getAbilityScore().getInt(), expectedAScore.getInt());
        assertEquals(character.getAbilityScore().getWis(), expectedAScore.getWis());
        assertEquals(character.getAbilityScore().getCha(), expectedAScore.getCha());

    }

    @Test
    public void evaluateCharClass()
    {
        CharClass charClass = new CharClass();
        charClass.setClassID(1);
        charClass.setClassName("Fighter");
        charClass.setClassTrait(1);

        character.setCharClass(charClass);
        assertEquals(character.getCharClass().getClassID(), expectedClass.getClassID());
        assertEquals(character.getCharClass().getClassName(), expectedClass.getClassName());
        assertEquals(character.getCharClass().getClassTrait(), expectedClass.getClassTrait());
    }

    @Test
    public void evaluateSubclass()
    {
        Subclass subclass = new Subclass();
        subclass.setClassID(1);
        subclass.setClassName("Kung Fu");

        character.setSubclass(subclass);
        assertEquals(character.getSubclass().getClassID(), expSubclass.getClassID());
        assertEquals(character.getSubclass().getClassName(), expSubclass.getClassName());

    }

    @Test
    public void evaluateBackground()
    {
        Background background = new Background();
        background.setBackgroundID(1);
        background.setTitle("Pirate");
        background.setDescription("Raised by Pirates");

        character.setBackground(background);
        assertEquals(character.getBackground().getBackgroundID(), expectedBackground.getBackgroundID());
        assertEquals(character.getBackground().getTitle(), expectedBackground.getTitle());
        assertEquals(character.getBackground().getDescription(), expectedBackground.getDescription());
    }

    @Test
    public void evaluateLevel()
    {
        Level level = new Level();
        level.setLevel(5);
        level.setProficiency(10);

        character.setLevel(level);
        assertEquals(character.getLevel().getLevel(), expectedLevel.getLevel());
        assertEquals(character.getLevel().getProficiency(), expectedLevel.getProficiency());
    }

    @Test
    public void evaluateOverallCharacter()
    {

        Character newChar = new Character();
        newChar.setAbilityScore(expectedAScore);
        newChar.setBackground(expectedBackground);
        newChar.setCharClass(expectedClass);
        newChar.setLevel(expectedLevel);
        newChar.setName("Billy Bob");
        newChar.setRace(expectedRace);
        newChar.setSubRace(expectedSubrace);
        newChar.setSubclass(expSubclass);

        assertEquals(newChar.getAbilityScore(), expectedCharacter.getAbilityScore());
        assertEquals(newChar.getBackground(), expectedCharacter.getBackground());
        assertEquals(newChar.getCharClass(), expectedCharacter.getCharClass());
        assertEquals(newChar.getLevel(), expectedCharacter.getLevel());
        assertEquals(newChar.getName(), expectedCharacter.getName());
        assertEquals(newChar.getRace(), expectedCharacter.getRace());
        assertEquals(newChar.getSubRace(), expectedCharacter.getSubRace());
        assertEquals(newChar.getSubclass(), expectedCharacter.getSubclass());

    }

}
