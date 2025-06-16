
    typedef struct databits
    {
        short array[32];
        //double unused;
    } Bitarray;

    typedef enum set
    {
        a,
        b,
        c,
        d

    } Bitenum;

    unsigned char get_bit(const char *array, size_t X, size_t W);

void arrays(Bitarray * ba_ptr)
{

    Bitarray * ptr;

    Bitenum ee;

    Bitarray ba;

    if (ba_ptr->array[d] == 40)
        ba_ptr->array[0] = d;
    else
        ba_ptr->array[1] = d;

}

//#include <stdio.h>

unsigned char get_bit_value(const char *array, size_t X, size_t W) {
    // if (W >= X * 8) {
    //     fprintf(stderr, "Bit position out of range!\n");
    //     return 0;
    // }

    size_t byte_index = W / 8;  // Find which byte contains the bit
    size_t bit_index = W % 8;   // Find the bit position within the byte

    return (array[byte_index] >> bit_index) & 1; // Extract the bit
}