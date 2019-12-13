/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import java.util.Scanner;

/**
 *
 * @author 734260
 */
public class Pokedexf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Hello trainer! Which of my lovely features would you like to use? (Type the name of the tool)");
        System.out.println("\t1.  Pokédex \t2.  Type Information");
        String option = kb.nextLine();
        
        String[][] data = {
             { "Number 1, the Seed Pokemon.", "grass and poison", "A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon."  },
             { "Number 2, the Seed Pokemon.", "grass and poison", "Exposure to sunlight adds to its strength. Sunlight a;so makes the bud on its back grow larger." },
             { "Number 3, the Seed Pokemon.", "grass and poison", "This pokemon is a grass and poison type. By spreading the broad petals of its flower and catching the sun's rays, it fills its body with power." },
             { "Number 4, the Lizard Pokemon", "fire", "The fire on the tip of its tail is a measure of its life. If healthy, its tail burns intensely." },
             { "Number 5, the Flame Pokemon", "fire", "When it swings its burning tail, it elevates the air temperature to unbearably high levels." },
             { "Number 6, the Flame Pokemon", "fire and flying", "When expelling a blast of superhot fire, the red flame at the tip of its tail burns more intensely." },
             { "Number 7, the Tiny Turtle Pokemon", "water", "It shelters itself in its shell, then strikes back with spouts of water at every opportunity." },
             { "Number 8, the Turtle Pokemon", "water", "It often hides in water to stalk unwary prey. For last swimming, it moves its ears to maintain balance." },
             { "Number 9, the Shellfish Pokemon", "water", "The pressurized water jets on this brutal Pokemon's shell are used for high-speed tackles." },
            { "Number 10, the Worm Pokemon", "bug", "It is covered with green skin. When it grows, it sheds the skin, covers itself with silk, and becomes a cocoon." },
            { "Number 11, the Cocoon Pokemon", "bug", "Its shell is hard as an iron slab. A Metapod does not move very much because its preparing its soft innards for evolution inside the shell." },
            { "Number 12, the Butterfly Pokemon", "bug and flying", "Its wings are covered in toxic scales. If it finds bird pokemon going after Caterpie, Butterfree sprinkles its scales on them to drive them off." },
            { "Number 13, the Hairy Bug Pokemon", "bug and poison", "Its poison stinger is very powerful. Its bright-colored body is intended to ward off its enemies." },
            { "Number 14, the Cocoon Pokemon", "bug and poison", "Almost incapable of moving, this pokemon can only harden its shell to protect itself when it is in danger." },
            { "Number 15, the Poison Bee Pokemon", "bug and poison", "It can take down any opponent with its powerful poison stingers. It sometimes attacks in swarms." },
            { "Number 16, the Tiny Bird Pokemon", "normal and flying", "It is docile and prefers to avoid conflict. If disturbed, however, it can ferociously strike back." },
            { "Number 17, the Bird Pokemon", "normal and flying", "It flies over its wide territory in search of prey, downing it with its highly developed claws." },
            { "Number 18, the Bird Pokemon", "normal and flying", "By flapping its wings with all its might, Pidgeot can make a gust of wind capable of bending tall trees." },
            { "Number 19, the Mouse Pokemon", "normal", "It searches for food all day. It gnaws on hard objects to wear down its fangs, which grow constantly during its lifetime." },
            { "Number 20, the Mouse Pokemon", "normal", "With its long fangs, this surprisingly violent Pokémon can gnaw away even thick concrete with ease." },
            { "Number 21, the Tiny Bird Pokemon", "normal and flying", "It flaps its small wings busily to fly. Using its beak, it searches in grass for prey." },
            { "Number 22, the Beak Pokemon", "normal and flying", "It has the stamina to fly all day on its broad wings. It fights by using its sharp beak." },
            { "Number 23, the Snake Pokemon", "poison", "It sneaks through grass without making a sound and strikes unsuspecting prey from behind." },
            { "Number 24, the Cobra Pokemon", "poison", "The pattern on its belly is for intimidation. It constricts foes while they are frozen in fear." },
            { "Number 25, the Mouse Pokemon", "electric", "It occasionally uses an electric shock to recharge a fellow Pikachu that is in a weakened state." },
            { "Number 26, the Mouse Pokemon", "electric", "Its tail discharges electricity into the ground, protecting it from getting shocked." },
            { "Number 27, the Mouse Pokemon", "ground", "It digs deep burrows to live in. When in danger, it rolls up its body to withstand attacks." },
            { "Number 28, the Mouse Pokemon", "ground", "The spikes on its body are made up of its hardened hide. It rolls up and attacks foes with its spikes." },
            { "Number 29, the Poison Pin Pokemon", "poison", "While it does not prefer to fight, even one drop of the poison it secretes from barbs can be fatal." },
            { "Number 30, the Poison Pin Pokemon", "poison", "When it senses danger, it raises all the barbs on its body. These barbs grow slower than Nidorinos." },
            { "Number 31, the Drill Pokemon", "poison and ground", "Its entire body is armored with hard scales. It will protect the young in its burrow with its life." },
            { "Number 32, the Poison Pin Pokemon", "poison", "It scans its surroundings by raising its ears out of the grass. Its toxic horn is for protection." },
            { "Number 33, the Poison Pin Pokemon", "poison", "It has a violent disposition and stabs foes with its horn, which oozes poison upon impact." },
            { "Number 34, the Drill Pokemon", "poison and ground", "One swing of its mighty tail can snap a telephone pole as if it were a matchstick." },
            { "Number 35, the Fairy Pokemon", "fairy", "On nights with a full moon, Clefairy gather from all over and dance. Bathing in moonlight makes them float." },
            { "Number 36, the Fairy Pokemon", "fairy", "Their ears are sensitive enough to hear a pin drop from over a mile away, so theyre usually found in quiet places." },
            { "Number 37, the Fox Pokemon", "fire", "As each tail grows, its fur becomes more lustrous. When held, it feels slightly warm." },
            { "Number 38, the Fox Pokemon", "fire", "Each of its nine tails is imbued with supernatural power, and it can live for a thousand years." },
            { "Number 39, the Balloon Pokemon", "normal and fairy", "Looking into its cute, round eyes makes it start singing a song so pleasant listeners cant help but fall asleep." },
            { "Number 40, the Balloon Pokemon", "normal and fairy", "Its fine fur feels so pleasant, those who accidentally touch it cannot take their hands away." },
            { "Number 41, the Bat Pokemon", "poison and flying", "It does not need eyes, because it emits ultrasonic waves to check its surroundings while it flies." },
            { "Number 42, the Bat Pokemon", "poison and flying", "Flitting around in the dead of night, it sinks its fangs into its prey and drains a nearly fatal amount of blood." },
            { "Number 43, the Weed Pokemon", "grass and poison", "It often plants its root feet in the ground during the day and sows seeds as it walks about at night." },
            { "Number 44, the Weed Pokemon", "grass and poison", "The honey it drools from its mouth smells so atrocious, it can curl noses more than a mile away." },
            { "Number 45, the Flower Pokemon", "grass and poison", "Its petals are the largest in the world. As it walks, it scatters extremely allergenic pollen." },
            { "Number 46, the Mushroom Pokemon", "bug and grass", "Mushrooms named tochukaso grow on its back. They grow along with the host Paras." },
            { "Number 47, the Mushroom Pokemon", "bug and grass", "A mushroom grown larger than the hosts body controls Parasect. It scatters poisonous spores." },
            { "Number 48, the Insect Pokemon", "bug and poison", "Its big eyes are actually clusters of tiny eyes. At night, its kind is drawn by light." },
            { "Number 49, the Poison Moth Pokemon", "bug and poison", "It flutters its wings to scatter dustlike scales. The scales leach toxins if they contact skin." },
            { "Number 50, the Mole Pokemon", "ground", "A Pokémon that lives underground. Because of its dark habitat, it is repelled by bright sunlight." },
            { "Number 51, the Mole Pokemon", "ground", "Its three heads move alternately, driving it through tough soil to depths of over 60 miles." },
            { "Number 52, the Scratch Cat Pokemon", "normal", "It is nocturnal in nature. If it spots something shiny, its eyes glitter brightly." },
            { "Number 53, the Classy Cat Pokemon", "normal", "A very haughty Pokémon. Among fans, the size of the jewel in its forehead is a topic of much talk." },
            { "Number 54, the Duck Pokemon", "water", "When headaches stimulate its brain cells, which are usually inactive, it can use a mysterious power." },
            { "Number 55, the Duck Pokemon", "water", "When its forehead shines mysteriously, Golduck can use the full extent of its power." },
            { "Number 56, the Pig Monkey Pokemon", "fighting", "It lives in treetop colonies. If one becomes enraged, the whole colony rampages for no reason." },
            { "Number 57, the Pig Monkey Pokemon", "fighting", "It grows angry if you see its eyes and gets angrier if you run. If you beat it, it gets even madder." },
            { "Number 58, the Puppy Pokemon", "fire", "Extremely loyal to its Trainer, it will bark at those who approach the Trainer unexpectedly and run them out of town." },
            { "Number 59, the Legendary Pokemon", "fire", "The sight of it running over 6,200 miles in a single day and night has captivated many people." },
            { "Number 60, the Tadpole Pokemon", "water", "Its skin is so thin, its internal organs are visible. It has trouble walking on its newly grown feet." },
            { "Number 61, the Tadpole Pokemon", "water", "The spiral pattern on its belly subtly undulates. Staring at it gradually causes drowsiness." },
            { "Number 62, the Tadpole Pokemon", "water and fighting", "With its extremely tough muscles, it can keep swimming in the Pacific Ocean without resting." },
            { "Number 63, the Psi Pokemon", "psychic", "Using its psychic power is such a strain on its brain that it needs to sleep for 18 hours a day." },
            { "Number 64, the Psi Pokemon", "psychic", "It stares at its silver spoon to focus its mind. It emits more alpha waves while doing so." },
            { "Number 65, the Psi Pokemon", "psychic", "The spoons clutched in its hands are said to have been created by its psychic powers." },
            { "Number 66, the Superpower Pokemon", "fighting", "Though small in stature, it is powerful enough to easily heft and throw a number of Geodude at once." },
            { "Number 67, the Superpower Pokemon", "fighting", "It happily carries heavy cargo to toughen up. It willingly does hard work for people." },
            { "Number 68, the Superpower Pokemon", "fighting", "Its four muscled arms slam foes with powerful punches and chops at blinding speed." },
            { "Number 69, the Flower Pokemon", "grass and poison", "It prefers hot and humid environments. It is quick at capturing prey with its vines." },
            { "Number 70, the Flycatcher Pokemon", "grass and poison", "A Pokémon that appears to be a plant. It captures unwary prey by dousing them with a toxic powder." },
            { "Number 71, the Flycatcher Pokemon", "grass and poison", "It pools in its mouth a fluid with a honey-like scent, which is really an acid that dissolves anything." },
            { "Number 72, the Jellyfish Pokemon", "water and poison", "Because its body is almost entirely composed of water, it shrivels up if it is washed ashore." },
            { "Number 73, the Jellyfish Pokemon", "water and poison", "It extends its 80 tentacles to form an encircling poisonous net that is difficult to escape." },
            { "Number 74, the Rock Pokemon", "rock and ground", "At rest, it looks just like a rock. Carelessly stepping on it will make it swing its fists angrily." },
            { "Number 75, the Rock Pokemon", "rock and ground", "It rolls on mountain paths to move. Once it builds momentum, no Pokémon can stop it without difficulty." },
            { "Number 76, the Megaton Pokemon", "rock and ground", "Even dynamite cant harm its hard, boulder-like body. It sheds its hide just once a year." },
            { "Number 77, the Fire Horse Pokemon", "fire", "As a newborn, it can barely stand. However, through galloping, its legs are made tougher and faster." },
            { "Number 78, the Fire Horse Pokemon", "fire", "When at an all-out gallop, its blazing mane sparkles, enhancing its beautiful appearance." },
            { "Number 79, the Dopey Pokemon", "water and psychic", "Although slow, it is skilled at fishing with its tail. It does not feel pain if its tail is bitten." },
            { "Number 80, the Hermit Crab Pokemon", "water and psychic", "Though usually dim witted, it seems to become inspired if the Shellder on its tail bites down." },
            { "Number 81, the Magnet Pokemon", "electric and steel", "The electromagnetic waves emitted by the units at the sides of its head expel antigravity, which allows it to float." },
            { "Number 82, the Magnet Pokemon", "electric and steel", "The stronger electromagnetic waves from the three linked Magnemite are enough to dry out surrounding moisture." },
            { "Number 83, the Wild Duck Pokemon", "normal and flying", "It cant live without the stalk it holds. Thats why it defends the stalk from attackers with its life." },
            { "Number 84, the Twin Bird Pokemon", "normal and flying", "The brains in its two heads appear to communicate emotions to each other with a telepathic power." },
            { "Number 85, the Triple Bird Pokemon", "normal and flying", "When Doduo evolves into this odd breed, one of its heads splits into two. It runs at nearly 40 mph." },
            { "Number 86, the Sea Lion Pokemon", "water", "The colder it gets, the better it feels. It joyfully swims around oceans so cold that they are filled with floating ice." },
            { "Number 87, the Sea Lion Pokemon", "water", "Its streamlined body has low resistance, and it swims around cold oceans at a speed of eight knots." },
            { "Number 88, the Sludge Pokemon", "poison", "Born from sludge, these Pokémon now gather in polluted places and increase the bacteria in their bodies." },
            { "Number 89, the Sludge Pokemon", "poison", "It's so stinky! Muks body contains toxic elements, and any plant will wilt when it passes by." },
            { "Number 90, the Bivalve Pokemon", "water", "It swims backward by opening and closing its two shells. Its large tongue is always kept hanging out." },
            { "Number 91, the Bivalve Pokemon", "water and ice", "It fights by keeping its shell tightly shut for protection and by shooting spikes to repel foes." },
            { "Number 92, the Gas Pokemon", "ghost and poison", "Born from gases, anyone would faint if engulfed by its gaseous body, which contains poison." },
            { "Number 93, the Gas Pokemon", "ghost and poison", "It likes to lurk in the dark and tap shoulders with a gaseous hand. Its touch causes endless shuddering." },
            { "Number 94, the Shadow Pokemon", "ghost and poison", "The leer that floats in darkness belongs to a Gengar delighting in casting curses on people." },
            { "Number 95, the Rock Snake Pokemon", "rock and ground", "Opening its large mouth, it ingests massive amounts of soil and creates long tunnels." },
            { "Number 96, the Hypnosis Pokemon", "psychic", "It can tell what people are dreaming by sniffing with its big nose. It loves fun dreams." },
            { "Number 97, the Hypnosis Pokemon", "psychic", "Seeing its swinging pendulum can induce sleep in three seconds, even in someone who just woke up." },
            { "Number 98, the River Crab Pokemon", "water", "It lives in burrows dug on sandy beaches. Its pincers fully grow back if they are broken in battle." },
            { "Number 99, the Pincer Pokemon", "water", "The larger pincer has 10,000- horsepower strength. However, it is so heavy, it is difficult to aim." },
           { "Number 100, the Ball Pokemon", "electric", "It looks just like a Poke Ball. It is dangerous because it may electrocute or explode on contact." },
           { "Number 101, the Ball Pokemon", "electric", "It is known to drift on winds if it is bloated to bursting with stored electricity." },
           { "Number 102, the Egg Pokemon", "grass and psychic", "Its six eggs converse using telepathy. They can quickly gather if they become separated." },
           { "Number 103, the Coconut Pokemon", "grass and psychic", "It is called The Walking Jungle. If a head grows too big, it falls off and becomes an Exeggcute." },
           { "Number 104, the Lonely Pokemon", "ground", "When it thinks of its dead mother, it cries. Its crying makes the skull it wears rattle hollowly." },
           { "Number 105, the Bone Keeper Pokemon", "ground", "From its birth, this savage Pokémon constantly holds bones. It is skilled in using them as weapons." },
           { "Number 106, the Kicking Pokemon", "fighting", "Its legs can stretch double. First-time foes are startled by its extensible reach." },
           { "Number 107, the Punching Pokemon", "fighting", "The arm-twisting punches it throws pulverize even concrete. It rests after three minutes of fighting." },
           { "Number 108, the Licking Pokemon", "normal", "Being licked by its long, saliva-covered tongue leaves a tingling sensation. Extending its tongue retracts its tail." },
           { "Number 109, the Posion Gas Pokemon", "poison", "Toxic gas is held within its thin, balloon-shaped body, so it can cause massive explosions." },
           { "Number 110, the Posion Gas Pokemon", "poison", "Inhaling toxic fumes from trash and mixing them inside its body lets it spread an even fouler stench." },
           { "Number 111, the Spikes Pokemon", "rock and ground", "Its powerful tackles can destroy anything. However, it is too slow witted to help people work." },
           { "Number 112, the Drill Pokemon", "rock and ground", "Standing on its hind legs freed its forelegs and made it smarter. It is very forgetful, however." },
           { "Number 113, the Egg Pokemon", "normal", "A kindly Pokémon that lays highly nutritious eggs and shares them with injured Pokmon or people." },
           { "Number 114, the Vine Pokemon", "grass", "Many writhing vines cover it, so its true identity remains unknown. The blue vines grow its whole life long." },
           { "Number 115, the Parent Pokemon", "normal", "It raises its offspring in its belly pouch. It lets the baby out to play only when it feels safe." },
           { "Number 116, the Dragon Pokemon", "water", "It makes its nest in the shade of corals. If it senses danger, it spits murky ink and flees." },
           { "Number 117, the Dragon Pokemon", "water", "Its spines provide protection. Its fins and bones are prized as traditional-medicine ingredients." },
           { "Number 118, the Goldfish Pokemon", "water", "Though it appears very elegant when swimming with fins unfurled, it can jab powerfully with its horn." },
           { "Number 119, the Goldfish Pokemon", "water", "In autumn, its body becomes more fatty in preparing to propose to a mate. It takes on beautiful colors." },
           { "Number 120, the Star Shape Pokemon", "water", "As long as its red core remains, it can regenerate its body instantly, even if its torn apart." },
           { "Number 121, the Mysterious Pokemon", "water and psychic", "Its core shines in many colors and sends radio signals into space to communicate with something." },
           { "Number 122, the Barrier Pokemon", "psychic and fairy", "It shapes an invisible wall in midair by minutely vibrating its fingertips to stop molecules in the air." },
           { "Number 123, the Mantis Pokemon", "bug and flying", "The sharp scythes on its forearms become increasingly sharp by cutting through hard objects." },
           { "Number 124, the Human Shape Pokemon", "ice and psychic", "Its cries sound like human speech. However, it is impossible to tell what it is trying to say." },
           { "Number 125, the Electric Pokemon", "electric", "Research is progressing on storing lightning in Electabuzz so this energy can be used at any time." },
           { "Number 126, the Spitfire Pokemon", "fire", "The scorching fire exhaled by Magmar forms heat waves around its body, making it hard to see the Pokémon clearly." },
           { "Number 127, the Stag Beetle Pokemon", "bug", "It grips prey with its powerful pincers and will not let go until the prey is torn in half." },
           { "Number 128, the Wild Bull Pokemon", "normal", "Once it takes aim at its foe, it makes a headlong charge. It is famous for its violent nature." },
           { "Number 129, the Fish Pokemon", "water", "A Magikarp living for many years can leap a mountain using Splash. The move remains useless, though." },
           { "Number 130, the Atrocious Pokemon", "water and flying", "Once it begins to rampage, a Gyarados will burn everything down, even in a harsh storm." },
           { "Number 131, the Transport Pokemon", "water and ice", "Able to understand human speech and very intelligent, it loves to swim in the sea with people on its back." },
           { "Number 132, the Transform Pokemon", "normal", "It can reconstitute its entire cellular structure to change into what it sees, but it returns to normal when it relaxes." },
           { "Number 133, the Evolution Pokemon", "normal", "Thanks to its unstable genetic makeup, this special Pokémon conceals many different possible evolutions." },
           { "Number 134, the Bubble Jet Pokemon", "water", "Its cell composition is similar to water molecules. As a result, it cant be seen when it melts away into water." },
           { "Number 135, the Lighting Pokemon", "electric", "By storing electricity in its body, it can shoot its bristlelike fur like a barrage of missiles." },
           { "Number 136, the Flame Pokemon", "fire", "Inhaled air is carried to its flame sac, heated, and exhaled as fire that reaches over 3,000 degrees F." },
           { "Number 137, the Virtual Pokemon", "normal", "A man-made Pokémon created using advanced scientific means. It can move freely in cyberspace." },
           { "Number 138, the Spiral Pokemon", "rock and water", "A Pokémon that was resurrected from a fossil using modern science. It swam in ancient seas." },
           { "Number 139, the Spiral Pokemon", "rock and water", "It is thought that this Pokémon became extinct because its spiral shell grew too large." },
           { "Number 140, the Shellfish Pokemon", "rock and water", "It is thought to have inhabited beaches 300 million years ago. It is protected by a stiff shell." },
           { "Number 141, the Shellfish Pokemon", "rock and water", "It is thought that this Pokémon came onto land because its prey adapted to life on land." },
           { "Number 142, the Fossil Pokemon", "rock and flying", "A Pokémon that roamed the skies in the dinosaur era. Its teeth are like saw blades." },
           { "Number 143, the Sleeping Pokemon", "normal", "When its belly is full, it becomes too lethargic to even lift a finger, so it is safe to bounce on its belly." },
           { "Number 144, the Freeze Pokemon", "ice and flying", "A legendary bird Pokémon. It can create blizzards by freezing moisture in the air." },
           { "Number 145, the Electric Pokemon", "electric and flying", "A legendary Pokémon that is said to live in thunderclouds. It freely controls lightning bolts." },
           { "Number 146, the Flame Pokemon", "fire and flying", "One of the legendary bird Pokémon. It is said that its appearance indicates the coming of spring." },
           { "Number 147, the Dragon Pokemon", "dragon", "It is called the Mirage Pokémon because so few have seen it. Its shed skin has been found." },
           { "Number 148, the Dragon Pokemon", "dragon", "If its body takes on an aura, the weather changes instantly. It is said to live in seas and lakes." },
           { "Number 149, the Dragon Pokemon", "dragon and flying", "It is said to make its home somewhere in the sea. It guides crews of shipwrecks to shore." },
           { "Number 150, the Genetic Pokemon", "psychic", "A Pokémon created by recombining Mews genes. Its said to have the most savage heart among Pokemon." },
           { "Number 151, the New Species Pokemon", "psychic", "Mew is said to possess the genetic composition of all pokemon. It is capable of making itself invisible at will, so it entirely avoids notice ven if it approaches people." },
        }; 
        
        String[][] typeData = {
            //Normal
            { "No effect against: Ghost", "Not very effective against: Rock and Steel", "Super effective against: N/A", "Weak to: Fighting", "Resists: N/A", "Immune to: Ghost" },
            //Fighting
            { "No effect against: Ghost", "Not very effective against: Flying, Poison, Bug, Psychic, and Fairy", "Super effective against: Normal, Rock, Steel, Ice, and Dark", "Weak to: Flying, Psychic, and Fairy", "Resists: Rock, Bug, and Dark", "Immune to: N/A" },
            //Flying
            { "No effect against: N/A", "Not very effective against: Rock, Steel, and Electric", "Super effective against: Fighting, Bug, and Grass", "Weak to: Rock, Electric and Ice", "Resists: Fighting, Bug, and Grass", "Immune to: Ground" },
            //Poison
            { "No effect against: Steel", "Not very effective against: Poison, Ground, Rock, and Ghost", "Super effective against: Grass and Fairy", "Weak to: Ground and Psychic", "Resists: Fighting, Poison, Bug, Grass, and Fairy", "Immune to: N/A" },
            //Ground
            { "No effect against: Flying", "Not very effective against: Bug and Grass", "Super effective against: Poison, Rock, Steel, Fire and Electric", "Weak to: Water, Grass, and Ice", "Resists: Poison and Rock", "Immune to: Electric" },
            //Rock
            { "No effect against: N/A", "Not very effective against: Fighting, Ground, and Steel", "Super effective against: Flying, Bug, Fire, and Ice", "Weak to: Fighting, Ground, Steel, Water, and Grass", "Resists: Normal, Flying, Poison, and Fire", "Immune to: N/A" },
            //Bug
            { "No effect against: N/A", "Not very effective against: Fighting, Flying, Poison, Ghost, Steel, Fire, and Fairy", "Super effective against: Grass, Psychic, and Dark", "Weak to: Flying, Rock, and Fire", "Resists: Fighting, Ground, and Grass", "Immune to: N/A" },
            //Ghost
            { "No effect against: Normal", "Not very effective against: Dark", "Super effective against: Ghost and Psychic", "Weak to: Ghost and Dark", "Resists: Poison and Bug", "Immune to: Normal and Fighting" },
            //Steel
            { "No effect against: N/A", "Not very effective against: Steel, Fire, Water, and Electric", "Super effective against: Rock, Ice, and Fairy", "Weak to: Fighting, Ground, and Fire", "Resists: Normal, Flying, Rock, Bug, Steel, Grass, Psychic, Ice, Dragon, and Fairy", "Immune to: Poison" },
            //Fire
            { "No effect against: N/A", "Not very effective against: Rock, Fire, Water, and Dragon", "Super effective against: Bug, Steel, Grass, and Ice", "Weak to: Ground, Rock, and Water", "Resists: Bug, Steel, Fire, Grass, Ice, and Fairy", "Immune to: N/A" },
            //Water
            { "No effect against: N/A", "Not very effective against: Water, Grass, and Dragon", "Super effective against: Ground, Rock, and Fire", "Weak to: Grass and Electric", "Resists: Steel, Fire, Water, and Ice", "Immune to: N/A" },
            //Grass
            { "No effect against: N/A", "Not very effective against: Flting, Poison, Bug, Steel, Fire, Grass, and Dragon", "Super effective against: Ground, Rock, and Water", "Weak to: Flying, Poison, Bug, Fire, and Ice", "Resists: Ground, Water, Grass, and Electric", "Immune to: N/A" },
            //Electric
            { "No effect against: Ground", "Not very effective against: Grass, Electric, and Dragon", "Super effective against: Flying and Water", "Weak to: Ground", "Resists: Flying, Steel, and Electric", "Immune to: N/A" },
            //Psychic
            { "No effect against: Dark", "Not very effective against: Steel and Psychic", "Super effective against: Fightinf and Poison", "Weak to: Bug, Ghost, and Dark", "Resists: Fighting and Psychic", "Immune to: N/A" },
            //Ice
            { "No effect against: N/A", "Not very effective against: Steel, Fire, Water, and Ice", "Super effective against: Flying, Ground, Grass, and Dragon", "Weak to: Fighting, Rock, Steel, and Fire", "Resists: Ice", "Immune to: N/A" },
            //Dragon
            { "No effect against: Fairy", "Not very effective against: Steel", "Super effective against: Dragon", "Weak to: Ice, Dragon, and Fairy", "Resists: Fire, Water, Grass, and Electric", "Immune to: N/A" },
            //Dark
            { "No effect against: N/A", "Not very effective against: Fighting, Dark, and Fairy", "Super effective against: Ghost and Psychic", "Weak to: Fighting, Bug, and Fairy", "Resists: Ghost and Dark", "Immune to: Psychic" },
            //Fairy
            { "No effect against: N/A", "Not very effective against: Poison, Steel, and Fire", "Super effective against: Fighting, Dragon, and Dark", "Weak to: Poison and Steel", "Resists: Fighting, Bug, and Dark", "Immune to: Dragon" },
        };
        
        if (option.equals("Pokedex")) {
            System.out.println("Okay, now what is the name of the Pokemon you wish to search for?");
            String name = kb.nextLine();
            System.out.println ("Okay, what would you like to learn about this pokemon?");
            System.out.println ("Type the letter you would like.");
            System.out.println("\tA.  Number/Category \tB.  Types \tC.  Description");
            String info = kb.nextLine();
            if (name.equals("Bulbasaur") && info.equals("A")) {
                System.out.print(data[0][0]);
            }
            if (name.equals("Bulbasaur") && info.equals("B")) {
                System.out.print(data[0][1]);
            }
            if (name.equals("Bulbasaur") && info.equals("C")) {
                System.out.print(data[0][2]);
            }
            if (name.equals("Ivysaur") && info.equals("A")) {
                System.out.print(data[1][0]);
            }
            if (name.equals("Ivysaur") && info.equals("B")) {
                System.out.print(data[1][1]);
            }
            if (name.equals("Ivysaur") && info.equals("C")) {
                System.out.print(data[1][2]);
            }
            if (name.equals("Venusaur") && info.equals("A")) {
                System.out.print(data[2][0]);
            }
            if (name.equals("Venusaur") && info.equals("B")) {
                System.out.print(data[2][1]);
            }
            if (name.equals("Venusaur") && info.equals("C")) {
                System.out.print(data[2][2]);
            }
            if (name.equals("Charmander") && info.equals("A")) {
                System.out.print(data[3][0]);
            }
            if (name.equals("Charmander") && info.equals("B")) {
                System.out.print(data[3][1]);
            }
            if (name.equals("Charmander") && info.equals("C")) {
                System.out.print(data[3][2]);
            }
            if (name.equals("Charmeleon") && info.equals("A")) {
                System.out.print(data[4][0]);
            }
            if (name.equals("Charmeleon") && info.equals("B")) {
                System.out.print(data[4][1]);
            }
            if (name.equals("Charmeleon") && info.equals("C")) {
                System.out.print(data[4][2]);
            }
            if (name.equals("Charizard") && info.equals("A")) {
                System.out.print(data[5][0]);
            }
            if (name.equals("Charizard") && info.equals("B")) {
                System.out.print(data[5][1]);
            }
            if (name.equals("Charizard") && info.equals("C")) {
                System.out.print(data[5][2]);
            }
            if (name.equals("Squirtle") && info.equals("A")) {
                System.out.print(data[6][0]);
            }
            if (name.equals("Squirtle") && info.equals("B")) {
                System.out.print(data[6][1]);
            }
            if (name.equals("Squirtle") && info.equals("C")) {
                System.out.print(data[6][2]);
            }
            if (name.equals("Wartortle") && info.equals("A")) {
                System.out.print(data[7][0]);
            }
            if (name.equals("Wartortle") && info.equals("B")) {
                System.out.print(data[7][1]);
            }
            if (name.equals("Wartortle") && info.equals("C")) {
                System.out.print(data[7][2]);
            }
            if (name.equals("Blastoise") && info.equals("A")) {
                System.out.print(data[8][0]);
            }
            if (name.equals("Blastoise") && info.equals("B")) {
                System.out.print(data[8][1]);
            }
            if (name.equals("Blastoise") && info.equals("C")) {
                System.out.print(data[8][2]);
            }
            if (name.equals("Caterpie") && info.equals("A")) {
                System.out.print(data[9][0]);
            }
            if (name.equals("Caterpie") && info.equals("B")) {
                System.out.print(data[9][1]);
            }
            if (name.equals("Caterpie") && info.equals("C")) {
                System.out.print(data[9][2]);
            }
            if (name.equals("Metapod") && info.equals("A")) {
                System.out.print(data[10][0]);
            }
            if (name.equals("Metapod") && info.equals("B")) {
                System.out.print(data[10][1]);
            }
            if (name.equals("Metapod") && info.equals("C")) {
                System.out.print(data[10][2]);
            }
            if (name.equals("Butterfree") && info.equals("A")) {
                System.out.print(data[11][0]);
            }
            if (name.equals("Butterfree") && info.equals("B")) {
                System.out.print(data[11][1]);
            }
            if (name.equals("Butterfree") && info.equals("C")) {
                System.out.print(data[11][2]);
            }
            if (name.equals("Weedle") && info.equals("A")) {
                System.out.print(data[12][0]);
            }
            if (name.equals("Weedle") && info.equals("B")) {
                System.out.print(data[12][1]);
            }
            if (name.equals("Weedle") && info.equals("C")) {
                System.out.print(data[12][2]);
            }
            if (name.equals("Kakuna") && info.equals("A")) {
                System.out.print(data[13][0]);
            }
            if (name.equals("Kakuna") && info.equals("B")) {
                System.out.print(data[13][1]);
            }
            if (name.equals("Kakuna") && info.equals("C")) {
                System.out.print(data[13][2]);
            }
            if (name.equals("Beedrill") && info.equals("A")) {
                System.out.print(data[14][0]);
            }
            if (name.equals("Beedrill") && info.equals("B")) {
                System.out.print(data[14][1]);
            }
            if (name.equals("Beedrill") && info.equals("C")) {
                System.out.print(data[14][2]);
            }
            if (name.equals("Pidgey") && info.equals("A")) {
                System.out.print(data[15][0]);
            }
            if (name.equals("Pidgey") && info.equals("B")) {
                System.out.print(data[15][1]);
            }
            if (name.equals("Pidgey") && info.equals("C")) {
                System.out.print(data[15][2]);
            }
            if (name.equals("Pidgeotto") && info.equals("A")) {
                System.out.print(data[16][0]);
            }
            if (name.equals("Pidgeotto") && info.equals("B")) {
                System.out.print(data[16][1]);
            }
            if (name.equals("Pidgeotto") && info.equals("C")) {
                System.out.print(data[16][2]);
            }
            if (name.equals("Pidgeot") && info.equals("A")) {
                System.out.print(data[17][0]);
            }
            if (name.equals("Pidgeot") && info.equals("B")) {
                System.out.print(data[17][1]);
            }
            if (name.equals("Pidgeot") && info.equals("C")) {
                System.out.print(data[17][2]);
            }
            if (name.equals("Rattata") && info.equals("A")) {
                System.out.print(data[18][0]);
            }
            if (name.equals("Rattata") && info.equals("B")) {
                System.out.print(data[18][1]);
            }
            if (name.equals("Rattata") && info.equals("C")) {
                System.out.print(data[18][2]);
            }
            if (name.equals("Raticate") && info.equals("A")) {
                System.out.print(data[19][0]);
            }
            if (name.equals("Raticate") && info.equals("B")) {
                System.out.print(data[19][1]);
            }
            if (name.equals("Raticate") && info.equals("C")) {
                System.out.print(data[19][2]);
            }
            if (name.equals("Spearow") && info.equals("A")) {
                System.out.print(data[20][0]);
            }
            if (name.equals("Spearow") && info.equals("B")) {
                System.out.print(data[20][1]);
            }
            if (name.equals("Spearow") && info.equals("C")) {
                System.out.print(data[20][2]);
            }
            if (name.equals("Fearow") && info.equals("A")) {
                System.out.print(data[21][0]);
            }
            if (name.equals("Fearow") && info.equals("B")) {
                System.out.print(data[21][1]);
            }
            if (name.equals("Fearow") && info.equals("C")) {
                System.out.print(data[21][2]);
            }
            if (name.equals("Ekans") && info.equals("A")) {
                System.out.print(data[22][0]);
            }
            if (name.equals("Ekans") && info.equals("B")) {
                System.out.print(data[22][1]);
            }
            if (name.equals("Ekans") && info.equals("C")) {
                System.out.print(data[22][2]);
            }
            if (name.equals("Arbok") && info.equals("A")) {
                System.out.print(data[23][0]);
            }
            if (name.equals("Arbok") && info.equals("B")) {
                System.out.print(data[23][1]);
            }
            if (name.equals("Arbok") && info.equals("C")) {
                System.out.print(data[23][2]);
            }
            if (name.equals("Pikachu") && info.equals("A")) {
                System.out.print(data[24][0]);
            }
            if (name.equals("Pikachu") && info.equals("B")) {
                System.out.print(data[24][1]);
            }
            if (name.equals("Raichu") && info.equals("C")) {
                System.out.print(data[25][2]);
            }
            if (name.equals("Raichu") && info.equals("A")) {
                System.out.print(data[25][0]);
            }
            if (name.equals("Raichu") && info.equals("B")) {
                System.out.print(data[25][1]);
            }
            if (name.equals("Sandshrew") && info.equals("C")) {
                System.out.print(data[26][2]);
            }
            if (name.equals("Sandshrew") && info.equals("A")) {
                System.out.print(data[26][0]);
            }
            if (name.equals("Sandshrew") && info.equals("B")) {
                System.out.print(data[26][1]);
            }
            if (name.equals("Sandslash") && info.equals("C")) {
                System.out.print(data[27][2]);
            }
            if (name.equals("Sandslash") && info.equals("A")) {
                System.out.print(data[27][0]);
            }
            if (name.equals("Sandslash") && info.equals("B")) {
                System.out.print(data[27][1]);
            }
            if (name.equals("Nidoran Female") && info.equals("C")) {
                System.out.print(data[28][2]);
            }
            if (name.equals("Nidoran Female") && info.equals("A")) {
                System.out.print(data[28][0]);
            }
            if (name.equals("Nidoran Female") && info.equals("B")) {
                System.out.print(data[28][1]);
            }
            if (name.equals("Nidorina") && info.equals("C")) {
                System.out.print(data[29][2]);
            }
            if (name.equals("Nidorina") && info.equals("A")) {
                System.out.print(data[29][0]);
            }
            if (name.equals("Nidorina") && info.equals("B")) {
                System.out.print(data[29][1]);
            }
            if (name.equals("Nidoqueen") && info.equals("C")) {
                System.out.print(data[30][2]);
            }
            if (name.equals("Nidoqueen") && info.equals("A")) {
                System.out.print(data[30][0]);
            }
            if (name.equals("Nidoqueen") && info.equals("B")) {
                System.out.print(data[30][1]);
            }
            if (name.equals("Nidoran Male") && info.equals("C")) {
                System.out.print(data[31][2]);
            }
            if (name.equals("Nidoran Male") && info.equals("A")) {
                System.out.print(data[31][0]);
            }
            if (name.equals("Nidoran Male") && info.equals("B")) {
                System.out.print(data[31][1]);
            }
            if (name.equals("Nidorino") && info.equals("C")) {
                System.out.print(data[32][2]);
            }
            if (name.equals("Nidorino") && info.equals("A")) {
                System.out.print(data[32][0]);
            }
            if (name.equals("Nidorino") && info.equals("B")) {
                System.out.print(data[32][1]);
            }
            if (name.equals("Nidoking") && info.equals("C")) {
                System.out.print(data[33][2]);
            }
            if (name.equals("Nidoking") && info.equals("A")) {
                System.out.print(data[33][0]);
            }
            if (name.equals("Nidoking") && info.equals("B")) {
                System.out.print(data[33][1]);
            }
            if (name.equals("Clefairy") && info.equals("C")) {
                System.out.print(data[34][2]);
            }
            if (name.equals("Clefairy") && info.equals("A")) {
                System.out.print(data[34][0]);
            }
            if (name.equals("Clefairy") && info.equals("B")) {
                System.out.print(data[34][1]);
            }
            if (name.equals("Clefable") && info.equals("C")) {
                System.out.print(data[35][2]);
            }
            if (name.equals("Clefable") && info.equals("A")) {
                System.out.print(data[35][0]);
            }
            if (name.equals("Clefable") && info.equals("B")) {
                System.out.print(data[35][1]);
            }
            if (name.equals("Vulpix") && info.equals("C")) {
                System.out.print(data[36][2]);
            }
            if (name.equals("Vulpix") && info.equals("A")) {
                System.out.print(data[36][0]);
            }
            if (name.equals("Vulpix") && info.equals("B")) {
                System.out.print(data[36][1]);
            }
            if (name.equals("Ninetales") && info.equals("C")) {
                System.out.print(data[37][2]);
            }
            if (name.equals("Ninetales") && info.equals("A")) {
                System.out.print(data[37][0]);
            }
            if (name.equals("Ninetales") && info.equals("B")) {
                System.out.print(data[37][1]);
            }
            if (name.equals("Jigglypuff") && info.equals("C")) {
                System.out.print(data[38][2]);
            }
            if (name.equals("Jigglypuff") && info.equals("A")) {
                System.out.print(data[38][0]);
            }
            if (name.equals("Jigglypuff") && info.equals("B")) {
                System.out.print(data[38][1]);
            }
            if (name.equals("Wigglytuff") && info.equals("C")) {
                System.out.print(data[39][2]);
            }
            if (name.equals("Wigglytuff") && info.equals("A")) {
                System.out.print(data[39][0]);
            }
            if (name.equals("Wigglytuff") && info.equals("B")) {
                System.out.print(data[39][1]);
            }
            if (name.equals("Zubat") && info.equals("A")) {
                System.out.print(data[40][0]);
            }
            if (name.equals("Zubat") && info.equals("B")) {
                System.out.print(data[40][1]);
            }
            if (name.equals("Zubat") && info.equals("C")) {
                System.out.print(data[40][2]);
            }
            if (name.equals("Golbat") && info.equals("A")) {
                System.out.print(data[41][0]);
            }
            if (name.equals("Golbat") && info.equals("B")) {
                System.out.print(data[41][1]);
            }
            if (name.equals("Golbat") && info.equals("C")) {
                System.out.print(data[41][2]);
            }
            if (name.equals("Oddish") && info.equals("A")) {
                System.out.print(data[42][0]);
            }
            if (name.equals("Oddish") && info.equals("B")) {
                System.out.print(data[42][1]);
            }
            if (name.equals("Oddish") && info.equals("C")) {
                System.out.print(data[42][2]);
            }
            if (name.equals("Gloom") && info.equals("A")) {
                System.out.print(data[43][0]);
            }
            if (name.equals("Gloom") && info.equals("B")) {
                System.out.print(data[43][1]);
            }
            if (name.equals("Gloom") && info.equals("C")) {
                System.out.print(data[43][2]);
            }
            if (name.equals("Vileplume") && info.equals("A")) {
                System.out.print(data[44][0]);
            }
            if (name.equals("Vileplume") && info.equals("B")) {
                System.out.print(data[44][1]);
            }
            if (name.equals("Vileplume") && info.equals("C")) {
                System.out.print(data[44][2]);
            }
            if (name.equals("Paras") && info.equals("A")) {
                System.out.print(data[45][0]);
            }
            if (name.equals("Paras") && info.equals("B")) {
                System.out.print(data[45][1]);
            }
            if (name.equals("Paras") && info.equals("C")) {
                System.out.print(data[45][2]);
            }
            if (name.equals("Parasect") && info.equals("A")) {
                System.out.print(data[46][0]);
            }
            if (name.equals("Parasect") && info.equals("B")) {
                System.out.print(data[46][1]);
            }
            if (name.equals("Parasect") && info.equals("C")) {
                System.out.print(data[46][2]);
            }
            if (name.equals("Venonat") && info.equals("A")) {
                System.out.print(data[47][0]);
            }
            if (name.equals("Venonat") && info.equals("B")) {
                System.out.print(data[47][1]);
            }
            if (name.equals("Venonat") && info.equals("C")) {
                System.out.print(data[47][2]);
            }
            if (name.equals("Venomoth") && info.equals("A")) {
                System.out.print(data[48][0]);
            }
            if (name.equals("Venomoth") && info.equals("B")) {
                System.out.print(data[48][1]);
            }
            if (name.equals("Venomoth") && info.equals("C")) {
                System.out.print(data[48][2]);
            }
            if (name.equals("Diglett") && info.equals("A")) {
                System.out.print(data[49][0]);
            }
            if (name.equals("Diglett") && info.equals("B")) {
                System.out.print(data[49][1]);
            }
            if (name.equals("Diglett") && info.equals("C")) {
                System.out.print(data[49][2]);
            }
            if (name.equals("Dugtrio") && info.equals("A")) {
                System.out.print(data[50][0]);
            }
            if (name.equals("Dugtrio") && info.equals("B")) {
                System.out.print(data[50][1]);
            }
            if (name.equals("Dugtrio") && info.equals("C")) {
                System.out.print(data[50][2]);
            }
            if (name.equals("Meowth") && info.equals("A")) {
                System.out.print(data[51][0]);
            }
            if (name.equals("Meowth") && info.equals("B")) {
                System.out.print(data[51][1]);
            }
            if (name.equals("Meowth") && info.equals("C")) {
                System.out.print(data[51][2]);
            }
            if (name.equals("Persian") && info.equals("A")) {
                System.out.print(data[52][0]);
            }
            if (name.equals("Persian") && info.equals("B")) {
                System.out.print(data[52][1]);
            }
            if (name.equals("Persian") && info.equals("C")) {
                System.out.print(data[52][2]);
            }
            if (name.equals("Psyduck") && info.equals("A")) {
                System.out.print(data[53][0]);
            }
            if (name.equals("Psyduck") && info.equals("B")) {
                System.out.print(data[53][1]);
            }
            if (name.equals("Psyduck") && info.equals("C")) {
                System.out.print(data[53][2]);
            }
            if (name.equals("Golduck") && info.equals("A")) {
                System.out.print(data[54][0]);
            }
            if (name.equals("Golduck") && info.equals("B")) {
                System.out.print(data[54][1]);
            }
            if (name.equals("Golduck") && info.equals("C")) {
                System.out.print(data[54][2]);
            }
            if (name.equals("Mankey") && info.equals("A")) {
                System.out.print(data[55][0]);
            }
            if (name.equals("Mankey") && info.equals("B")) {
                System.out.print(data[55][1]);
            }
            if (name.equals("Mankey") && info.equals("C")) {
                System.out.print(data[55][2]);
            }
            if (name.equals("Primeape") && info.equals("A")) {
                System.out.print(data[56][0]);
            }
            if (name.equals("Primeape") && info.equals("B")) {
                System.out.print(data[56][1]);
            }
            if (name.equals("Primeape") && info.equals("C")) {
                System.out.print(data[56][2]);
            }
            if (name.equals("Growlithe") && info.equals("A")) {
                System.out.print(data[57][0]);
            }
            if (name.equals("Growlithe") && info.equals("B")) {
                System.out.print(data[57][1]);
            }
            if (name.equals("Growlithe") && info.equals("C")) {
                System.out.print(data[57][2]);
            }
            if (name.equals("Arcanine") && info.equals("A")) {
                System.out.print(data[58][0]);
            }
            if (name.equals("Arcanine") && info.equals("B")) {
                System.out.print(data[58][1]);
            }
            if (name.equals("Arcanine") && info.equals("C")) {
                System.out.print(data[58][2]);
            }
            if (name.equals("Poliwag") && info.equals("A")) {
                System.out.print(data[59][0]);
            }
            if (name.equals("Poliwag") && info.equals("B")) {
                System.out.print(data[59][1]);
            }
            if (name.equals("Poliwag") && info.equals("C")) {
                System.out.print(data[59][2]);
            }
            if (name.equals("Poliwhirl") && info.equals("A")) {
                System.out.print(data[60][0]);
            }
            if (name.equals("Poliwhirl") && info.equals("B")) {
                System.out.print(data[60][1]);
            }
            if (name.equals("Poliwhirl") && info.equals("C")) {
                System.out.print(data[60][2]);
            }
            if (name.equals("Poliwrath") && info.equals("A")) {
                System.out.print(data[61][0]);
            }
            if (name.equals("Poliwrath") && info.equals("B")) {
                System.out.print(data[61][1]);
            }
            if (name.equals("Poliwrath") && info.equals("C")) {
                System.out.print(data[61][2]);
            }
            if (name.equals("Abra") && info.equals("A")) {
                System.out.print(data[62][0]);
            }
            if (name.equals("Abra") && info.equals("B")) {
                System.out.print(data[62][1]);
            }
            if (name.equals("Abra") && info.equals("C")) {
                System.out.print(data[62][2]);
            }
            if (name.equals("Kadabra") && info.equals("A")) {
                System.out.print(data[63][0]);
            }
            if (name.equals("Kadabra") && info.equals("B")) {
                System.out.print(data[63][1]);
            }
            if (name.equals("Kadabra") && info.equals("C")) {
                System.out.print(data[63][2]);
            }
            if (name.equals("Alakazam") && info.equals("A")) {
                System.out.print(data[64][0]);
            }
            if (name.equals("Alakazam") && info.equals("B")) {
                System.out.print(data[64][1]);
            }
            if (name.equals("Alakazam") && info.equals("C")) {
                System.out.print(data[64][2]);
            }
            if (name.equals("Machop") && info.equals("A")) {
                System.out.print(data[65][0]);
            }
            if (name.equals("Machop") && info.equals("B")) {
                System.out.print(data[65][1]);
            }
            if (name.equals("Machop") && info.equals("C")) {
                System.out.print(data[65][2]);
            }
            if (name.equals("Machoke") && info.equals("A")) {
                System.out.print(data[66][0]);
            }
            if (name.equals("Machoke") && info.equals("B")) {
                System.out.print(data[66][1]);
            }
            if (name.equals("Machoke") && info.equals("C")) {
                System.out.print(data[66][2]);
            }
            if (name.equals("Machamp") && info.equals("A")) {
                System.out.print(data[67][0]);
            }
            if (name.equals("Machamp") && info.equals("B")) {
                System.out.print(data[67][1]);
            }
            if (name.equals("Machamp") && info.equals("C")) {
                System.out.print(data[67][2]);
            }
            if (name.equals("Bellsprout") && info.equals("A")) {
                System.out.print(data[68][0]);
            }
            if (name.equals("Bellsprout") && info.equals("B")) {
                System.out.print(data[68][1]);
            }
            if (name.equals("Bellsprout") && info.equals("C")) {
                System.out.print(data[68][2]);
            }
            if (name.equals("Weepinbell") && info.equals("A")) {
                System.out.print(data[69][0]);
            }
            if (name.equals("Weepinbell") && info.equals("B")) {
                System.out.print(data[69][1]);
            }
            if (name.equals("Weepinbell") && info.equals("C")) {
                System.out.print(data[69][2]);
            }
            if (name.equals("Victreebel") && info.equals("A")) {
                System.out.print(data[70][0]);
            }
            if (name.equals("Victreebel") && info.equals("B")) {
                System.out.print(data[70][1]);
            }
            if (name.equals("Victreebel") && info.equals("C")) {
                System.out.print(data[70][2]);
            }
            if (name.equals("Tentacool") && info.equals("A")) {
                System.out.print(data[71][0]);
            }
            if (name.equals("Tentacool") && info.equals("B")) {
                System.out.print(data[71][1]);
            }
            if (name.equals("Tentacool") && info.equals("C")) {
                System.out.print(data[71][2]);
            }
            if (name.equals("Tentacruel") && info.equals("A")) {
                System.out.print(data[72][0]);
            }
            if (name.equals("Tentacruel") && info.equals("B")) {
                System.out.print(data[72][1]);
            }
            if (name.equals("Tentacruel") && info.equals("C")) {
                System.out.print(data[72][2]);
            }
            if (name.equals("Geodude") && info.equals("A")) {
                System.out.print(data[73][0]);
            }
            if (name.equals("Geodude") && info.equals("B")) {
                System.out.print(data[73][1]);
            }
            if (name.equals("Geodude") && info.equals("C")) {
                System.out.print(data[73][2]);
            }
            if (name.equals("Graveler") && info.equals("A")) {
                System.out.print(data[74][0]);
            }
            if (name.equals("Graveler") && info.equals("B")) {
                System.out.print(data[74][1]);
            }
            if (name.equals("Graveler") && info.equals("C")) {
                System.out.print(data[74][2]);
            }
            if (name.equals("Golem") && info.equals("A")) {
                System.out.print(data[75][0]);
            }
            if (name.equals("Golem") && info.equals("B")) {
                System.out.print(data[75][1]);
            }
            if (name.equals("Golem") && info.equals("C")) {
                System.out.print(data[75][2]);
            }
            if (name.equals("Ponyta") && info.equals("A")) {
                System.out.print(data[76][0]);
            }
            if (name.equals("Ponyta") && info.equals("B")) {
                System.out.print(data[76][1]);
            }
            if (name.equals("Ponyta") && info.equals("C")) {
                System.out.print(data[76][2]);
            }
            if (name.equals("Rapidash") && info.equals("A")) {
                System.out.print(data[77][0]);
            }
            if (name.equals("Rapidash") && info.equals("B")) {
                System.out.print(data[77][1]);
            }
            if (name.equals("Rapidash") && info.equals("C")) {
                System.out.print(data[77][2]);
            }
            if (name.equals("Slowpoke") && info.equals("A")) {
                System.out.print(data[78][0]);
            }
            if (name.equals("Slowpoke") && info.equals("B")) {
                System.out.print(data[78][1]);
            }
            if (name.equals("Slowpoke") && info.equals("C")) {
                System.out.print(data[78][2]);
            }
            if (name.equals("Slowbro") && info.equals("A")) {
                System.out.print(data[79][0]);
            }
            if (name.equals("Slowbro") && info.equals("B")) {
                System.out.print(data[79][1]);
            }
            if (name.equals("Slowbro") && info.equals("C")) {
                System.out.print(data[79][2]);
            }
            if (name.equals("Magnemite") && info.equals("A")) {
                System.out.print(data[80][0]);
            }
            if (name.equals("Magnemite") && info.equals("B")) {
                System.out.print(data[80][1]);
            }
            if (name.equals("Magnemite") && info.equals("C")) {
                System.out.print(data[80][2]);
            }
            if (name.equals("Magneton") && info.equals("A")) {
                System.out.print(data[81][0]);
            }
            if (name.equals("Magneton") && info.equals("B")) {
                System.out.print(data[81][1]);
            }
            if (name.equals("Magneton") && info.equals("C")) {
                System.out.print(data[81][2]);
            }
            if (name.equals("Farfetch'd") && info.equals("A")) {
                System.out.print(data[82][0]);
            }
            if (name.equals("Farfetch'd") && info.equals("B")) {
                System.out.print(data[82][1]);
            }
            if (name.equals("Farfetch'd") && info.equals("C")) {
                System.out.print(data[82][2]);
            }
            if (name.equals("Doduo") && info.equals("A")) {
                System.out.print(data[83][0]);
            }
            if (name.equals("Doduo") && info.equals("B")) {
                System.out.print(data[83][1]);
            }
            if (name.equals("Doduo") && info.equals("C")) {
                System.out.print(data[83][2]);
            }
            if (name.equals("Dodrio") && info.equals("A")) {
                System.out.print(data[84][0]);
            }
            if (name.equals("Dodrio") && info.equals("B")) {
                System.out.print(data[84][1]);
            }
            if (name.equals("Dodrio") && info.equals("C")) {
                System.out.print(data[84][2]);
            }
            if (name.equals("Seel") && info.equals("A")) {
                System.out.print(data[85][0]);
            }
            if (name.equals("Seel") && info.equals("B")) {
                System.out.print(data[85][1]);
            }
            if (name.equals("Seel") && info.equals("C")) {
                System.out.print(data[85][2]);
            }
            if (name.equals("Dewgong") && info.equals("A")) {
                System.out.print(data[86][0]);
            }
            if (name.equals("Dewgong") && info.equals("B")) {
                System.out.print(data[86][1]);
            }
            if (name.equals("Dewgong") && info.equals("C")) {
                System.out.print(data[86][2]);
            }
            if (name.equals("Grimer") && info.equals("A")) {
                System.out.print(data[87][0]);
            }
            if (name.equals("Grimer") && info.equals("B")) {
                System.out.print(data[87][1]);
            }
            if (name.equals("Grimer") && info.equals("C")) {
                System.out.print(data[87][2]);
            }
            if (name.equals("Muk") && info.equals("A")) {
                System.out.print(data[88][0]);
            }
            if (name.equals("Muk") && info.equals("B")) {
                System.out.print(data[88][1]);
            }
            if (name.equals("Muk") && info.equals("C")) {
                System.out.print(data[88][2]);
            }
            if (name.equals("Shellder") && info.equals("A")) {
                System.out.print(data[89][0]);
            }
            if (name.equals("Shellder") && info.equals("B")) {
                System.out.print(data[89][1]);
            }
            if (name.equals("Shellder") && info.equals("C")) {
                System.out.print(data[89][2]);
            }
            if (name.equals("Cloyster") && info.equals("A")) {
                System.out.print(data[90][0]);
            }
            if (name.equals("Cloyster") && info.equals("B")) {
                System.out.print(data[90][1]);
            }
            if (name.equals("Cloyster") && info.equals("C")) {
                System.out.print(data[90][2]);
            }
            if (name.equals("Gastly") && info.equals("A")) {
                System.out.print(data[91][0]);
            }
            if (name.equals("Gastly") && info.equals("B")) {
                System.out.print(data[91][1]);
            }
            if (name.equals("Gastly") && info.equals("C")) {
                System.out.print(data[91][2]);
            }
            if (name.equals("Haunter") && info.equals("A")) {
                System.out.print(data[92][0]);
            }
            if (name.equals("Haunter") && info.equals("B")) {
                System.out.print(data[92][1]);
            }
            if (name.equals("Haunter") && info.equals("C")) {
                System.out.print(data[92][2]);
            }
            if (name.equals("Gengar") && info.equals("A")) {
                System.out.print(data[93][0]);
            }
            if (name.equals("Gengar") && info.equals("B")) {
                System.out.print(data[93][1]);
            }
            if (name.equals("Gengar") && info.equals("C")) {
                System.out.print(data[93][2]);
            }
            if (name.equals("Onix") && info.equals("A")) {
                System.out.print(data[94][0]);
            }
            if (name.equals("Onix") && info.equals("B")) {
                System.out.print(data[94][1]);
            }
            if (name.equals("Onix") && info.equals("C")) {
                System.out.print(data[94][2]);
            }
            if (name.equals("Drowzee") && info.equals("A")) {
                System.out.print(data[95][0]);
            }
            if (name.equals("Drowzee") && info.equals("B")) {
                System.out.print(data[95][1]);
            }
            if (name.equals("Drowzee") && info.equals("C")) {
                System.out.print(data[95][2]);
            }
            if (name.equals("Hypno") && info.equals("A")) {
                System.out.print(data[96][0]);
            }
            if (name.equals("Hypno") && info.equals("B")) {
                System.out.print(data[96][1]);
            }
            if (name.equals("Hypno") && info.equals("C")) {
                System.out.print(data[96][2]);
            }
            if (name.equals("Krabby") && info.equals("A")) {
                System.out.print(data[97][0]);
            }
            if (name.equals("Krabby") && info.equals("B")) {
                System.out.print(data[97][1]);
            }
            if (name.equals("Krabby") && info.equals("C")) {
                System.out.print(data[97][2]);
            }
            if (name.equals("Kingler") && info.equals("A")) {
                System.out.print(data[98][0]);
            }
            if (name.equals("Kingler") && info.equals("B")) {
                System.out.print(data[98][1]);
            }
            if (name.equals("Kingler") && info.equals("C")) {
                System.out.print(data[98][2]);
            }
            if (name.equals("Voltorb") && info.equals("A")) {
                System.out.print(data[99][0]);
            }
            if (name.equals("Voltorb") && info.equals("B")) {
                System.out.print(data[99][1]);
            }
            if (name.equals("Voltorb") && info.equals("C")) {
                System.out.print(data[99][2]);
            }
            if (name.equals("Electrode") && info.equals("A")) {
                System.out.print(data[100][0]);
            }
            if (name.equals("Electrode") && info.equals("B")) {
                System.out.print(data[100][1]);
            }
            if (name.equals("Electrode") && info.equals("C")) {
                System.out.print(data[100][2]);
            }
            if (name.equals("Exeggcute") && info.equals("A")) {
                System.out.print(data[101][0]);
            }
            if (name.equals("Exeggcute") && info.equals("B")) {
                System.out.print(data[101][1]);
            }
            if (name.equals("Exeggcute") && info.equals("C")) {
                System.out.print(data[101][2]);
            }
            if (name.equals("Exeggutor") && info.equals("A")) {
                System.out.print(data[102][0]);
            }
            if (name.equals("Exeggutor") && info.equals("B")) {
                System.out.print(data[102][1]);
            }
            if (name.equals("Exeggutor") && info.equals("C")) {
                System.out.print(data[102][2]);
            }
            if (name.equals("Cubone") && info.equals("A")) {
                System.out.print(data[103][0]);
            }
            if (name.equals("Cubone") && info.equals("B")) {
                System.out.print(data[103][1]);
            }
            if (name.equals("Cubone") && info.equals("C")) {
                System.out.print(data[103][2]);
            }
            if (name.equals("Marowak") && info.equals("A")) {
                System.out.print(data[104][0]);
            }
            if (name.equals("Marowak") && info.equals("B")) {
                System.out.print(data[104][1]);
            }
            if (name.equals("Marowak") && info.equals("C")) {
                System.out.print(data[104][2]);
            }
            if (name.equals("Hitmonlee") && info.equals("A")) {
                System.out.print(data[105][0]);
            }
            if (name.equals("Hitmonlee") && info.equals("B")) {
                System.out.print(data[105][1]);
            }
            if (name.equals("Hitmonlee") && info.equals("C")) {
                System.out.print(data[105][2]);
            }
            if (name.equals("Hitmonchan") && info.equals("A")) {
                System.out.print(data[106][0]);
            }
            if (name.equals("Hitmonchan") && info.equals("B")) {
                System.out.print(data[106][1]);
            }
            if (name.equals("Hitmonchan") && info.equals("C")) {
                System.out.print(data[106][2]);
            }
            if (name.equals("Lickitung") && info.equals("A")) {
                System.out.print(data[107][0]);
            }
            if (name.equals("Lickitung") && info.equals("B")) {
                System.out.print(data[107][1]);
            }
            if (name.equals("Lickitung") && info.equals("C")) {
                System.out.print(data[107][2]);
            }
            if (name.equals("Koffing") && info.equals("A")) {
                System.out.print(data[108][0]);
            }
            if (name.equals("Koffing") && info.equals("B")) {
                System.out.print(data[108][1]);
            }
            if (name.equals("Koffing") && info.equals("C")) {
                System.out.print(data[108][2]);
            }
            if (name.equals("Weezing") && info.equals("A")) {
                System.out.print(data[109][0]);
            }
            if (name.equals("Weezing") && info.equals("B")) {
                System.out.print(data[109][1]);
            }
            if (name.equals("Weezing") && info.equals("C")) {
                System.out.print(data[109][2]);
            }
            if (name.equals("Rhyhorn") && info.equals("A")) {
                System.out.print(data[110][0]);
            }
            if (name.equals("Rhyhorn") && info.equals("B")) {
                System.out.print(data[110][1]);
            }
            if (name.equals("Rhyhorn") && info.equals("C")) {
                System.out.print(data[110][2]);
            }
            if (name.equals("Rhydon") && info.equals("A")) {
                System.out.print(data[111][0]);
            }
            if (name.equals("Rhydon") && info.equals("B")) {
                System.out.print(data[111][1]);
            }
            if (name.equals("Rhydon") && info.equals("C")) {
                System.out.print(data[111][2]);
            }
            if (name.equals("Chansey") && info.equals("A")) {
                System.out.print(data[112][0]);
            }
            if (name.equals("Chansey") && info.equals("B")) {
                System.out.print(data[112][1]);
            }
            if (name.equals("Chansey") && info.equals("C")) {
                System.out.print(data[112][2]);
            }
            if (name.equals("Tangela") && info.equals("A")) {
                System.out.print(data[113][0]);
            }
            if (name.equals("Tangela") && info.equals("B")) {
                System.out.print(data[113][1]);
            }
            if (name.equals("Tangela") && info.equals("C")) {
                System.out.print(data[113][2]);
            }
            if (name.equals("Kangaskhan") && info.equals("A")) {
                System.out.print(data[114][0]);
            }
            if (name.equals("Kangaskhan") && info.equals("B")) {
                System.out.print(data[114][1]);
            }
            if (name.equals("Kangaskhan") && info.equals("C")) {
                System.out.print(data[114][2]);
            }
            if (name.equals("Horsea") && info.equals("A")) {
                System.out.print(data[115][0]);
            }
            if (name.equals("Horsea") && info.equals("B")) {
                System.out.print(data[115][1]);
            }
            if (name.equals("Horsea") && info.equals("C")) {
                System.out.print(data[115][2]);
            }
            if (name.equals("Seadra") && info.equals("A")) {
                System.out.print(data[116][0]);
            }
            if (name.equals("Seadra") && info.equals("B")) {
                System.out.print(data[116][1]);
            }
            if (name.equals("Goldeen") && info.equals("C")) {
                System.out.print(data[117][2]);
            }
            if (name.equals("Goldeen") && info.equals("A")) {
                System.out.print(data[117][0]);
            }
            if (name.equals("Goldeen") && info.equals("B")) {
                System.out.print(data[117][1]);
            }
            if (name.equals("Seaking") && info.equals("C")) {
                System.out.print(data[118][2]);
            }
            if (name.equals("Seaking") && info.equals("A")) {
                System.out.print(data[118][0]);
            }
            if (name.equals("Seaking") && info.equals("B")) {
                System.out.print(data[118][1]);
            }
            if (name.equals("Staryu") && info.equals("C")) {
                System.out.print(data[119][2]);
            }
            if (name.equals("Staryu") && info.equals("A")) {
                System.out.print(data[119][0]);
            }
            if (name.equals("Staryu") && info.equals("B")) {
                System.out.print(data[119][1]);
            }
            if (name.equals("Starmie") && info.equals("A")) {
                System.out.print(data[120][0]);
            }
            if (name.equals("Starmie") && info.equals("B")) {
                System.out.print(data[120][1]);
            }
            if (name.equals("Starmie") && info.equals("C")) {
                System.out.print(data[120][2]);
            }
            if (name.equals("Mr. Mime") && info.equals("A")) {
                System.out.print(data[121][0]);
            }
            if (name.equals("Mr. Mime") && info.equals("B")) {
                System.out.print(data[121][1]);
            }
            if (name.equals("Mr. Mime") && info.equals("C")) {
                System.out.print(data[121][2]);
            }
            if (name.equals("Scyther") && info.equals("A")) {
                System.out.print(data[122][0]);
            }
            if (name.equals("Scyther") && info.equals("B")) {
                System.out.print(data[122][1]);
            }
            if (name.equals("Scyther") && info.equals("C")) {
                System.out.print(data[122][2]);
            }
            if (name.equals("Jynx") && info.equals("A")) {
                System.out.print(data[123][0]);
            }
            if (name.equals("Jynx") && info.equals("B")) {
                System.out.print(data[123][1]);
            }
            if (name.equals("Jynx") && info.equals("C")) {
                System.out.print(data[123][2]);
            }
            if (name.equals("Electabuzz") && info.equals("A")) {
                System.out.print(data[124][0]);
            }
            if (name.equals("Electabuzz") && info.equals("B")) {
                System.out.print(data[124][1]);
            }
            if (name.equals("Electabuzz") && info.equals("C")) {
                System.out.print(data[124][2]);
            }
            if (name.equals("Magmar") && info.equals("A")) {
                System.out.print(data[125][0]);
            }
            if (name.equals("Magmar") && info.equals("B")) {
                System.out.print(data[125][1]);
            }
            if (name.equals("Magmar") && info.equals("C")) {
                System.out.print(data[125][2]);
            }
            if (name.equals("Pinsir") && info.equals("A")) {
                System.out.print(data[126][0]);
            }
            if (name.equals("Pinsir") && info.equals("B")) {
                System.out.print(data[126][1]);
            }
            if (name.equals("Pinsir") && info.equals("C")) {
                System.out.print(data[126][2]);
            }
            if (name.equals("Tauros") && info.equals("A")) {
                System.out.print(data[127][0]);
            }
            if (name.equals("Tauros") && info.equals("B")) {
                System.out.print(data[127][1]);
            }
            if (name.equals("Tauros") && info.equals("C")) {
                System.out.print(data[127][2]);
            }
            if (name.equals("Magikarp") && info.equals("A")) {
                System.out.print(data[128][0]);
            }
            if (name.equals("Magikarp") && info.equals("B")) {
                System.out.print(data[128][1]);
            }
            if (name.equals("Magikarp") && info.equals("C")) {
                System.out.print(data[128][2]);
            }
            if (name.equals("Gyarados") && info.equals("A")) {
                System.out.print(data[129][0]);
            }
            if (name.equals("Gyarados") && info.equals("B")) {
                System.out.print(data[129][1]);
            }
            if (name.equals("Gyarados") && info.equals("C")) {
                System.out.print(data[129][2]);
            }
            if (name.equals("Lapras") && info.equals("A")) {
                System.out.print(data[130][0]);
            }
            if (name.equals("Lapras") && info.equals("B")) {
                System.out.print(data[130][1]);
            }
            if (name.equals("Lapras") && info.equals("C")) {
                System.out.print(data[130][2]);
            }
            if (name.equals("Ditto") && info.equals("A")) {
                System.out.print(data[131][0]);
            }
            if (name.equals("Ditto") && info.equals("B")) {
                System.out.print(data[131][1]);
            }
            if (name.equals("Ditto") && info.equals("C")) {
                System.out.print(data[131][2]);
            }
            if (name.equals("Eevee") && info.equals("A")) {
                System.out.print(data[132][0]);
            }
            if (name.equals("Eevee") && info.equals("B")) {
                System.out.print(data[132][1]);
            }
            if (name.equals("Eevee") && info.equals("C")) {
                System.out.print(data[132][2]);
            }
            if (name.equals("Vaporeon") && info.equals("A")) {
                System.out.print(data[133][0]);
            }
            if (name.equals("Vaporeon") && info.equals("B")) {
                System.out.print(data[133][1]);
            }
            if (name.equals("Vaporeon") && info.equals("C")) {
                System.out.print(data[133][2]);
            }
            if (name.equals("Jolteon") && info.equals("A")) {
                System.out.print(data[134][0]);
            }
            if (name.equals("Jolteon") && info.equals("B")) {
                System.out.print(data[134][1]);
            }
            if (name.equals("Jolteon") && info.equals("C")) {
                System.out.print(data[134][2]);
            }
            if (name.equals("Flareon") && info.equals("A")) {
                System.out.print(data[135][0]);
            }
            if (name.equals("Flareon") && info.equals("B")) {
                System.out.print(data[135][1]);
            }
            if (name.equals("Flareon") && info.equals("C")) {
                System.out.print(data[135][2]);
            }
            if (name.equals("Porygon") && info.equals("A")) {
                System.out.print(data[136][0]);
            }
            if (name.equals("Porygon") && info.equals("B")) {
                System.out.print(data[136][1]);
            }
            if (name.equals("Porygon") && info.equals("C")) {
                System.out.print(data[136][2]);
            }
            if (name.equals("Omanyte") && info.equals("A")) {
                System.out.print(data[137][0]);
            }
            if (name.equals("Omanyte") && info.equals("B")) {
                System.out.print(data[137][1]);
            }
            if (name.equals("Omanyte") && info.equals("C")) {
                System.out.print(data[137][2]);
            }
            if (name.equals("Omastar") && info.equals("A")) {
                System.out.print(data[138][0]);
            }
            if (name.equals("Omastar") && info.equals("B")) {
                System.out.print(data[138][1]);
            }
            if (name.equals("Omastar") && info.equals("C")) {
                System.out.print(data[138][2]);
            }
            if (name.equals("Kabuto") && info.equals("A")) {
                System.out.print(data[139][0]);
            }
            if (name.equals("Kabuto") && info.equals("B")) {
                System.out.print(data[139][1]);
            }
            if (name.equals("Kabuto") && info.equals("C")) {
                System.out.print(data[139][2]);
            }
            if (name.equals("Kabutops") && info.equals("A")) {
                System.out.print(data[140][0]);
            }
            if (name.equals("Kabutops") && info.equals("B")) {
                System.out.print(data[140][1]);
            }
            if (name.equals("Kabutops") && info.equals("C")) {
                System.out.print(data[140][2]);
            }
            if (name.equals("Aerodactyl") && info.equals("A")) {
                System.out.print(data[141][0]);
            }
            if (name.equals("Aerodactyl") && info.equals("B")) {
                System.out.print(data[141][1]);
            }
            if (name.equals("Aerodactyl") && info.equals("C")) {
                System.out.print(data[141][2]);
            }
            if (name.equals("Snorlax") && info.equals("A")) {
                System.out.print(data[142][0]);
            }
            if (name.equals("Snorlax") && info.equals("B")) {
                System.out.print(data[142][1]);
            }
            if (name.equals("Snorlax") && info.equals("C")) {
                System.out.print(data[142][2]);
            }
            if (name.equals("Articuno") && info.equals("A")) {
                System.out.print(data[143][0]);
            }
            if (name.equals("Articuno") && info.equals("B")) {
                System.out.print(data[143][1]);
            }
            if (name.equals("Articuno") && info.equals("C")) {
                System.out.print(data[143][2]);
            }
            if (name.equals("Zapdos") && info.equals("A")) {
                System.out.print(data[144][0]);
            }
            if (name.equals("Zapdos") && info.equals("B")) {
                System.out.print(data[144][1]);
            }
            if (name.equals("Zapdos") && info.equals("C")) {
                System.out.print(data[144][2]);
            }
            if (name.equals("Moltres") && info.equals("A")) {
                System.out.print(data[145][0]);
            }
            if (name.equals("Moltres") && info.equals("B")) {
                System.out.print(data[145][1]);
            }
            if (name.equals("Moltres") && info.equals("C")) {
                System.out.print(data[145][2]);
            }
            if (name.equals("Dratini") && info.equals("A")) {
                System.out.print(data[146][0]);
            }
            if (name.equals("Dratini") && info.equals("B")) {
                System.out.print(data[146][1]);
            }
            if (name.equals("Dratini") && info.equals("C")) {
                System.out.print(data[146][2]);
            }
            if (name.equals("Dragonair") && info.equals("A")) {
                System.out.print(data[147][0]);
            }
            if (name.equals("Dragonair") && info.equals("B")) {
                System.out.print(data[147][1]);
            }
            if (name.equals("Dragonair") && info.equals("C")) {
                System.out.print(data[147][2]);
            }
            if (name.equals("Dragonite") && info.equals("A")) {
                System.out.print(data[148][0]);
            }
            if (name.equals("Dragonite") && info.equals("B")) {
                System.out.print(data[148][1]);
            }
            if (name.equals("Dragonite") && info.equals("C")) {
                System.out.print(data[148][2]);
            }
            if (name.equals("Mewtwo") && info.equals("A")) {
                System.out.print(data[149][0]);
            }
            if (name.equals("Mewtwo") && info.equals("B")) {
                System.out.print(data[149][1]);
            }
            if (name.equals("Mewtwo") && info.equals("C")) {
                System.out.print(data[149][2]);
            }
            if (name.equals("Mew") && info.equals("A")) {
                System.out.print(data[150][0]);
            }
            if (name.equals("Mew") && info.equals("B")) {
                System.out.print(data[150][1]);
            }
            if (name.equals("Mew") && info.equals("C")) {
                System.out.print(data[150][2]);
            }
            if (name.equals("Pikachu") && info.equals("C")) {
                System.out.print(data[24][2]);
            }
            if (name.equals("Seadra") && info.equals("C")) {
                System.out.print(data[116][2]);
            }
        
    }
        
        if (option.equals("Type Information")) {
            System.out.println("Ok, now what type would you like to search for?");
            String type = kb.nextLine();
            System.out.println("Okay, now what would you like to learn about this type?");
            System.out.println("Type the letter that you would like.");
            System.out.println("\tA.  No effects \tB.  Not very effectives \tC.  Super Effectives \tD.  Weaknesses \tE.  Resistances \tF. Immunities");
            String info = kb.nextLine();
            if (type.equals("Normal") && info.equals("A")) {
                System.out.print (typeData[0][0]);
            }
            if (type.equals("Normal") && info.equals("B")) {
                System.out.print (typeData[0][1]);
            }
            if (type.equals("Normal") && info.equals("C")) {
                System.out.print (typeData[0][2]);
            }
            if (type.equals("Normal") && info.equals("D")) {
                System.out.print (typeData[0][3]);
            }
            if (type.equals("Normal") && info.equals("E")) {
                System.out.print (typeData[0][4]);
            }
            if (type.equals("Normal") && info.equals("F")) {
                System.out.print (typeData[0][5]);
            }
            if (type.equals("Fighting") && info.equals("A")) {
                System.out.print (typeData[1][0]);
            }
            if (type.equals("Fighting") && info.equals("B")) {
                System.out.print (typeData[1][1]);
            }
            if (type.equals("Fighting") && info.equals("C")) {
                System.out.print (typeData[1][2]);
            }
            if (type.equals("Fighting") && info.equals("D")) {
                System.out.print (typeData[1][3]);
            }
            if (type.equals("Fighting") && info.equals("E")) {
                System.out.print (typeData[1][4]);
            }
            if (type.equals("Fighting") && info.equals("F")) {
                System.out.print (typeData[1][5]);
            }
            if (type.equals("Flying") && info.equals("A")) {
                System.out.print (typeData[2][0]);
            }
            if (type.equals("Flying") && info.equals("B")) {
                System.out.print (typeData[2][1]);
            }
            if (type.equals("Flying") && info.equals("C")) {
                System.out.print (typeData[2][2]);
            }
            if (type.equals("Flying") && info.equals("D")) {
                System.out.print (typeData[2][3]);
            }
            if (type.equals("Flying") && info.equals("E")) {
                System.out.print (typeData[2][4]);
            }
            if (type.equals("Flying") && info.equals("F")) {
                System.out.print (typeData[2][5]);
            }
            if (type.equals("Poison") && info.equals("A")) {
                System.out.print (typeData[3][0]);
            }
            if (type.equals("Poison") && info.equals("B")) {
                System.out.print (typeData[3][1]);
            }
            if (type.equals("Poison") && info.equals("C")) {
                System.out.print (typeData[3][2]);
            }
            if (type.equals("Poison") && info.equals("D")) {
                System.out.print (typeData[3][3]);
            }
            if (type.equals("Poison") && info.equals("E")) {
                System.out.print (typeData[3][4]);
            }
            if (type.equals("Poison") && info.equals("F")) {
                System.out.print (typeData[3][5]);
            }
            if (type.equals("Ground") && info.equals("A")) {
                System.out.print (typeData[4][0]);
            }
            if (type.equals("Ground") && info.equals("B")) {
                System.out.print (typeData[4][1]);
            }
            if (type.equals("Ground") && info.equals("C")) {
                System.out.print (typeData[4][2]);
            }
            if (type.equals("Ground") && info.equals("D")) {
                System.out.print (typeData[4][3]);
            }
            if (type.equals("Ground") && info.equals("E")) {
                System.out.print (typeData[4][4]);
            }
            if (type.equals("Ground") && info.equals("F")) {
                System.out.print (typeData[4][5]);
            }
            if (type.equals("Rock") && info.equals("A")) {
                System.out.print (typeData[5][0]);
            }
            if (type.equals("Rock") && info.equals("B")) {
                System.out.print (typeData[5][1]);
            }
            if (type.equals("Rock") && info.equals("C")) {
                System.out.print (typeData[5][2]);
            }
            if (type.equals("Rock") && info.equals("D")) {
                System.out.print (typeData[5][3]);
            }
            if (type.equals("Rock") && info.equals("E")) {
                System.out.print (typeData[5][4]);
            }
            if (type.equals("Rock") && info.equals("F")) {
                System.out.print (typeData[5][5]);
            }
            if (type.equals("Bug") && info.equals("A")) {
                System.out.print (typeData[6][0]);
            }
            if (type.equals("Bug") && info.equals("B")) {
                System.out.print (typeData[6][1]);
            }
            if (type.equals("Bug") && info.equals("C")) {
                System.out.print (typeData[6][2]);
            }
            if (type.equals("Bug") && info.equals("D")) {
                System.out.print (typeData[6][3]);
            }
            if (type.equals("Bug") && info.equals("E")) {
                System.out.print (typeData[6][4]);
            }
            if (type.equals("Bug") && info.equals("F")) {
                System.out.print (typeData[6][5]);
            }
            if (type.equals("Ghost") && info.equals("A")) {
                System.out.print (typeData[7][0]);
            }
            if (type.equals("Ghost") && info.equals("B")) {
                System.out.print (typeData[7][1]);
            }
            if (type.equals("Ghost") && info.equals("C")) {
                System.out.print (typeData[7][2]);
            }
            if (type.equals("Ghost") && info.equals("D")) {
                System.out.print (typeData[7][3]);
            }
            if (type.equals("Ghost") && info.equals("E")) {
                System.out.print (typeData[7][4]);
            }
            if (type.equals("Ghost") && info.equals("F")) {
                System.out.print (typeData[7][5]);
            }
            if (type.equals("Steel") && info.equals("A")) {
                System.out.print (typeData[8][0]);
            }
            if (type.equals("Steel") && info.equals("B")) {
                System.out.print (typeData[8][1]);
            }
            if (type.equals("Steel") && info.equals("C")) {
                System.out.print (typeData[8][2]);
            }
            if (type.equals("Steel") && info.equals("D")) {
                System.out.print (typeData[8][3]);
            }
            if (type.equals("Steel") && info.equals("E")) {
                System.out.print (typeData[8][4]);
            }
            if (type.equals("Steel") && info.equals("F")) {
                System.out.print (typeData[8][5]);
            }
            if (type.equals("Fire") && info.equals("A")) {
                System.out.print (typeData[9][0]);
            }
            if (type.equals("Fire") && info.equals("B")) {
                System.out.print (typeData[9][1]);
            }
            if (type.equals("Fire") && info.equals("C")) {
                System.out.print (typeData[9][2]);
            }
            if (type.equals("Fire") && info.equals("D")) {
                System.out.print (typeData[9][3]);
            }
            if (type.equals("Fire") && info.equals("E")) {
                System.out.print (typeData[9][4]);
            }
            if (type.equals("Fire") && info.equals("F")) {
                System.out.print (typeData[9][5]);
            }
            if (type.equals("Water") && info.equals("A")) {
                System.out.print (typeData[10][0]);
            }
            if (type.equals("Water") && info.equals("B")) {
                System.out.print (typeData[10][1]);
            }
            if (type.equals("Water") && info.equals("C")) {
                System.out.print (typeData[10][2]);
            }
            if (type.equals("Water") && info.equals("D")) {
                System.out.print (typeData[10][3]);
            }
            if (type.equals("Water") && info.equals("E")) {
                System.out.print (typeData[10][4]);
            }
            if (type.equals("Water") && info.equals("F")) {
                System.out.print (typeData[10][5]);
            }
            if (type.equals("Grass") && info.equals("A")) {
                System.out.print (typeData[11][0]);
            }
            if (type.equals("Grass") && info.equals("B")) {
                System.out.print (typeData[11][1]);
            }
            if (type.equals("Grass") && info.equals("C")) {
                System.out.print (typeData[11][2]);
            }
            if (type.equals("Grass") && info.equals("D")) {
                System.out.print (typeData[11][3]);
            }
            if (type.equals("Grass") && info.equals("E")) {
                System.out.print (typeData[11][4]);
            }
            if (type.equals("Grass") && info.equals("F")) {
                System.out.print (typeData[11][5]);
            }
            if (type.equals("Electric") && info.equals("A")) {
                System.out.print (typeData[12][0]);
            }
            if (type.equals("Electric") && info.equals("B")) {
                System.out.print (typeData[12][1]);
            }
            if (type.equals("Electric") && info.equals("C")) {
                System.out.print (typeData[12][2]);
            }
            if (type.equals("Electric") && info.equals("D")) {
                System.out.print (typeData[12][3]);
            }
            if (type.equals("Electric") && info.equals("E")) {
                System.out.print (typeData[12][4]);
            }
            if (type.equals("Electric") && info.equals("F")) {
                System.out.print (typeData[12][5]);
            }
            if (type.equals("Psychic") && info.equals("A")) {
                System.out.print (typeData[13][0]);
            }
            if (type.equals("Psychic") && info.equals("B")) {
                System.out.print (typeData[13][1]);
            }
            if (type.equals("Psychic") && info.equals("C")) {
                System.out.print (typeData[13][2]);
            }
            if (type.equals("Psychic") && info.equals("D")) {
                System.out.print (typeData[13][3]);
            }
            if (type.equals("Psychic") && info.equals("E")) {
                System.out.print (typeData[13][4]);
            }
            if (type.equals("Psychic") && info.equals("F")) {
                System.out.print (typeData[13][5]);
            }
            if (type.equals("Ice") && info.equals("A")) {
                System.out.print (typeData[14][0]);
            }
            if (type.equals("Ice") && info.equals("B")) {
                System.out.print (typeData[14][1]);
            }
            if (type.equals("Ice") && info.equals("C")) {
                System.out.print (typeData[14][2]);
            }
            if (type.equals("Ice") && info.equals("D")) {
                System.out.print (typeData[14][3]);
            }
            if (type.equals("Ice") && info.equals("E")) {
                System.out.print (typeData[14][4]);
            }
            if (type.equals("Ice") && info.equals("F")) {
                System.out.print (typeData[14][5]);
            }
            if (type.equals("Dragon") && info.equals("A")) {
                System.out.print (typeData[15][0]);
            }
            if (type.equals("Dragon") && info.equals("B")) {
                System.out.print (typeData[15][1]);
            }
            if (type.equals("Dragon") && info.equals("C")) {
                System.out.print (typeData[15][2]);
            }
            if (type.equals("Dragon") && info.equals("D")) {
                System.out.print (typeData[15][3]);
            }
            if (type.equals("Dragon") && info.equals("E")) {
                System.out.print (typeData[15][4]);
            }
            if (type.equals("Dragon") && info.equals("F")) {
                System.out.print (typeData[15][5]);
            }
            if (type.equals("Dark") && info.equals("A")) {
                System.out.print (typeData[16][0]);
            }
            if (type.equals("Dark") && info.equals("B")) {
                System.out.print (typeData[16][1]);
            }
            if (type.equals("Dark") && info.equals("C")) {
                System.out.print (typeData[16][2]);
            }
            if (type.equals("Dark") && info.equals("D")) {
                System.out.print (typeData[16][3]);
            }
            if (type.equals("Dark") && info.equals("E")) {
                System.out.print (typeData[16][4]);
            }
            if (type.equals("Dark") && info.equals("F")) {
                System.out.print (typeData[16][5]);
            }
            if (type.equals("Fairy") && info.equals("A")) {
                System.out.print (typeData[17][0]);
            }
            if (type.equals("Fairy") && info.equals("B")) {
                System.out.print (typeData[17][1]);
            }
            if (type.equals("Fairy") && info.equals("C")) {
                System.out.print (typeData[17][2]);
            }
            if (type.equals("Fairy") && info.equals("D")) {
                System.out.print (typeData[17][3]);
            }
            if (type.equals("Fairy") && info.equals("E")) {
                System.out.print (typeData[17][4]);
            }
            if (type.equals("Fairy") && info.equals("F")) {
                System.out.print (typeData[17][5]);
            }
            
        }
    
 }
}
